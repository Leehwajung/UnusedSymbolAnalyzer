package tool.compiler.java.visit;

import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ext.jl5.types.*;
import polyglot.frontend.Job;
import polyglot.main.Report;
import polyglot.types.*;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import tool.compiler.java.ast.EquGenLang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class EquGenerator extends ContextVisitor {
	
	/* Environments */
	private static HashMap<JL5ClassType, Boolean> classEnv;
	private static HashMap<JL5ProcedureInstance, Boolean> methodEnv;
	private static HashMap<JL5FieldInstance, Boolean> fieldEnv;
	
	/* Used */
	private static HashSet<JL5ClassType> usedclasses;
	private static HashSet<JL5ProcedureInstance> usedMethods;
	private static HashSet<JL5FieldInstance> usedFields;
	
	private static JL5ProcedureInstance currentMethodEnv;
	
	private static final boolean defaultUse = false;
	
	static {
		classEnv = new HashMap<>();
		methodEnv = new HashMap<>();
		fieldEnv = new HashMap<>();
		
		usedclasses = new HashSet<>();
		usedMethods = new HashSet<>();
		usedFields = new HashSet<>();
	}
	
	public EquGenerator(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
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
//		return super.enterCall(parent, n);
//	}
	
	@Override
	protected NodeVisitor enterCall(Node n)
			throws SemanticException {
		
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.visit.NodeVisitor#finish(polyglot.ast.Node)
	 */
	@Override
	public void finish(Node ast) {
		
		checkClassEnv();
		checkMethodEnv();
		checkFieldEnv();
		
		Report.report(1, "Class Env:\t\t" + classEnv);
		Report.report(1, "Method Env:\t" + methodEnv);
		Report.report(1, "Field Env:\t\t" + fieldEnv);
		
		super.finish(ast);
	}

	/**
	 * 환경 추가 메서드
	 */
	
	public void addToImportEnv() {
		
	}
	
	public void addToClassEnv(JL5ClassType classType) {
		classEnv.put(classType, defaultUse);
	}
	
	public void addToMethodEnv(JL5ProcedureInstance methodIns) {
		methodEnv.put(methodIns, defaultUse);
//		currentMethodEnv = methodIns;
	}
	
	public void addToFieldEnv(JL5FieldInstance fieldIns) {
		fieldEnv.put(fieldIns, defaultUse);
	}
	
	public void addToLocalEnv(LocalInstance localIns) {
		
	}
	
	/**
	 * 사용 여부 표시 메서드
	 */
	
	public void markOnImportEnv() {
		
	}
	
	public void markOnClassEnv(JL5ClassType classType) {
		usedclasses.add(classType);
	}
	
	public void markOnMethodEnv(JL5ProcedureInstance methodIns) {
		usedMethods.add(methodIns);
	}
	
	public void markOnFieldEnv(JL5FieldInstance fieldIns) {
		usedFields.add(fieldIns);
	}
	
	public void markOnLocalEnv(LocalInstance localIns) {
		
	}
	
	/**
	 * 환경 검사 메서드
	 */
	
	public void checkImportEnv() {
		
	}
	
	public void checkClassEnv() {
		checkEnv(classEnv, usedclasses);
	}
	
	public void checkMethodEnv() {
		checkEnv(methodEnv, usedMethods);
	}
	
	public void checkFieldEnv() {
		checkEnv(fieldEnv, usedFields);
	}
	
	public void checkLocalEnv() {
		
	}
	
	private void checkEnv(HashMap<?, Boolean> env, HashSet<?> usedEnv) {
		for(Entry<?, Boolean> curEnv: env.entrySet()) {
			for(Object used: usedEnv) {
				if(used.equals(curEnv.getKey())) {
					curEnv.setValue(true);
//					System.out.println(curEnv + ": " + used);
					break;
				}
//				System.out.println(curEnv + ": " + used);
			}
		}
	}
}