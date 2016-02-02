package tool.compiler.java.ast;

import polyglot.ast.AmbQualifierNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * AmbQualifierNode <: QualifierNode <: Prefix <: Node		<br>
 * AmbQualifierNode <: Ambiguous <: Node
 * @author LHJ
 */
public class EquGenAmbQualifierNodeExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		AmbQualifierNode aqnd = (AmbQualifierNode)this.node();
		Report.report(0, "Ambiguous qualifier node: " + aqnd);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}