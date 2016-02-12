package tool.compiler.java.ast;

import polyglot.ast.Stmt;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Stmt <: Term <: Node
 * @author LHJ
 */
public class EquGenStmtExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Stmt stmt = (Stmt)this.node();
		Report.report(0, "Statement: " + stmt);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}