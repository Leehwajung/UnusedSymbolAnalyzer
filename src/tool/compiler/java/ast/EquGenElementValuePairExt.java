package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ext.jl5.ast.ElementValuePair;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ElementValuePair <: Term <: Node
 * @author LHJ
 */
public class EquGenElementValuePairExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ElementValuePair evp = (ElementValuePair) this.node();
		Report.report(0, "Element value pair: " + evp);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}