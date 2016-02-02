package tool.compiler.java.ast;

import polyglot.ast.Formal;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Formal <: VarDecl <: Term <: Node
 * @author LHJ
 */
public class EquGenFormalExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Formal fml = (Formal) this.node();
		Report.report(0, "Formal: " + fml);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}