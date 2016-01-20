package tool.compiler.java.visit;

import polyglot.ast.Assign;
import polyglot.ast.Block;
import polyglot.ast.Call;
import polyglot.ast.CanonicalTypeNode;
import polyglot.ast.Cast;
import polyglot.ast.ClassBody;
import polyglot.ast.ClassMember;
import polyglot.ast.Eval;
import polyglot.ast.Id;
import polyglot.ast.Import;
import polyglot.ast.Lit;
import polyglot.ast.LocalDecl;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Return;
import polyglot.ast.StringLit;
import polyglot.ast.Term;
import polyglot.frontend.Job;
import polyglot.main.Report;
import polyglot.types.Context;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import tool.compiler.java.ast.EquGenLang;

import java.util.HashMap;
import java.util.HashSet;

public class EquGenerator extends ContextVisitor {
	
	public HashMap<Node,Boolean> environment;		// 환경 노드 맵 (Key: Node, Value: is used)
	public HashSet<Node> use;									// 사용한 노드 셋 (class: 변수 선언/형변환, method: 호출, filed/local value: 할당(r-value로 사용될 때))
	
	public EquGenerator(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
		environment = new HashMap<>();
		use = new HashSet<>();
	}
	
	@Override
	public EquGenLang lang() {
		return (EquGenLang) super.lang();
	}
	
	@Override
	public NodeVisitor begin() {
		Report.report(1, "EquGenerator: begin()");
		NodeVisitor nv = super.begin();
		return nv;
	}
	
	@Override
	public void finish() {
		Report.report(1, "EquGenerator: finish()");
		super.finish();
	}
	
//	@Override
//	protected NodeVisitor enterCall(Node parent, Node n)
//			throws SemanticException {
//
////		reportPackage(n);
//
//		return lang().equGenEnter(parent, n, this);
//	}
	
	@Override
	protected NodeVisitor enterCall(Node n)
			throws SemanticException {
		try {
//			environment.put(n, false);
//			System.out.println("enter: " + n);
		} catch (ClassCastException ignored) {	}
		
		return lang().equGenEnter(n, this);	// 추가한 메소드 호출
	}
	
//	@Override
//	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
//			throws SemanticException {
//
//		return super.leaveCall(parent, old, n, v);
//	}
	
	@Override
	protected Node leaveCall(Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
//		environment.remove(n);
//		System.out.println("leave: " + n);
		
		return lang().equGen(n,  this);	// 추가한 메소드 호출
	}
	
//	@Override
//	protected Node leaveCall(Node n) throws SemanticException {
//
//		return super.leaveCall(n);
//	}
	
	@Override
	public TypeSystem typeSystem() {
		return super.typeSystem();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.visit.ContextVisitor#addDecls(polyglot.ast.Node)
	 */
	@Override
	protected void addDecls(Node n) {
		
		if(n instanceof Call || n instanceof Assign || n instanceof LocalDecl || n instanceof Cast) {
			// TODO: LocalDecl인 경우 할당이 포함되어 있는지 판단하여 집어넣기 (선언과 할당을 동시에 하는 경우, Assign으로 안 걸러짐)
			// TODO: Cast할 때 Canonical Type이면 제외하기
//			Object dd = null;
//			((ASDF)dd).getClass();
			use.add(n);
			System.out.println("\n\t[USE] addDecls: " + n + ":\t\t" + n.getClass());
//			if(n instanceof Call) {
//				System.out.println("Call=" + ((Call)n).methodInstance().formalTypes());
////				System.out.println("Call=" + (((Call)n).arguments().get(0)).constantValue());
//			}
			if(n instanceof LocalDecl) {
			System.out.println("Call=" + ((LocalDecl)n).localInstance().isCanonical());
//			System.out.println("Call=" + (((Call)n).arguments().get(0)).constantValue());
			}
		}
		
//		if(!(n instanceof Id || n instanceof CanonicalTypeNode || n instanceof Lit || n instanceof Return || n instanceof Block || n instanceof Eval || n instanceof ClassBody || n instanceof Assign)) {
		if(n instanceof ClassMember || n instanceof LocalDecl || n instanceof Import) {
			environment.put(n, false);
			Report.report(0, "\t[ENV] addDecls: " + n + ":\t\t" + n.getClass());
		}
		super.addDecls(n);
	}

	/* (non-Javadoc)
	 * @see polyglot.visit.ContextVisitor#enterScope(polyglot.ast.Node, polyglot.ast.Node)
	 */
	@Override
	protected Context enterScope(Node parent, Node n) {
//		environment.put(n, false);
		System.out.println("===enterScope: " + n+ ":\t\t" + n.getClass() 
//				+ "  *****  " + environment
				);
		return super.enterScope(parent, n);
	}

	
	


	/* (non-Javadoc)
	 * @see polyglot.visit.NodeVisitor#finish(polyglot.ast.Node)
	 */
	@Override
	public void finish(Node ast) {
		// TODO Auto-generated method stub
		super.finish(ast);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	class GenTest {
		private int member;
	
		public void main(String[] args) {
			int x = 7;
			mmmmm = method(1.1);
			char dd = mmmmm;
			int d = x;
		}
		
		public char method(double dd) {
			mmmmm = 'b';
			member = (int)dd;
			return 'a';
		}
		
		private char mmmmm;
	}
}


