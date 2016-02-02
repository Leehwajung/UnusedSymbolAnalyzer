package tool.compiler.java.ast;

import polyglot.ast.AmbTypeNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * AmbTypeNode <: TypeNode <: Term <: Node	<br>
 * AmbTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
 * AmbTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
 * @author LHJ
 */
public class EquGenAmbTypeNodeExt extends EquGenTypeNodeExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		AmbTypeNode atnd = (AmbTypeNode)this.node();
		Report.report(0, "Ambiguous qualifier node: " + atnd);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}