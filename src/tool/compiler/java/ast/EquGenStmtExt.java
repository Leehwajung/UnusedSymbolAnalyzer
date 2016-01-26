package tool.compiler.java.ast;

import polyglot.ast.Stmt;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenStmtExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Stmt stmt = (Stmt)this.node();
		Report.report(0, "Stmt: " + stmt);
		
//		String dd = "";
//		for(Node no: v.environment.keySet()) {
//			try {
//				dd += ((Node)no).toString();
//			} catch (ClassCastException e){
//				
//			}
//		}
//		
//		Report.report(0, "stmt Use: " + stmt + " ::::::: " 
////				+ v.environment.size() + "................" + v.environment);
////				+ v.context().currentClassScope());
//				+ v.environment);
		
//		System.out.println(v.environment);
//		v.visitChildren()
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}