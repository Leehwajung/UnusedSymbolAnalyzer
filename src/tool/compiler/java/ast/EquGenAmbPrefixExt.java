package tool.compiler.java.ast;

import polyglot.ast.AmbPrefix;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * AmbPrefix <: Prefix <: Node		<br>
 * AmbPrefix <: Ambiguous <: Node
 * @author LHJ
 */
public class EquGenAmbPrefixExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		AmbPrefix apfx = (AmbPrefix)this.node();
		Report.report(0, "Ambiguous Prefix: " + apfx);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}