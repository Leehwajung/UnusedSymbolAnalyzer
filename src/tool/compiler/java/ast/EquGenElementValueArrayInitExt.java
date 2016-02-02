package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ext.jl5.ast.ElementValueArrayInit;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ElementValueArrayInit <: Term <: Node
 * @author LHJ
 */
public class EquGenElementValueArrayInitExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ElementValueArrayInit evai = (ElementValueArrayInit) this.node();
		Report.report(0, "Element Value Array Initialization: " + evai);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}