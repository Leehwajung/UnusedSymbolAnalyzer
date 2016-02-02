package tool.compiler.java.ast;

import polyglot.ast.ClassBody;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ClassBody <: Term <: Node
 * @author LHJ
 */
public class EquGenClassBodyExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ClassBody clzbody = (ClassBody) this.node();
		Report.report(0, "Class body: " + clzbody);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}