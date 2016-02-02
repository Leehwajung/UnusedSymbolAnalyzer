package tool.compiler.java.ast;

import polyglot.ast.TypeNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * TypeNode <: Term <: Node	<br>
 * TypeNode <: Receiver <: Prefix <: Node	<br>
 * TypeNode <: QualifierNode <: Prefix <: Node
 * @author LHJ
 */
public class EquGenTypeNodeExt extends EquGenTermExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		TypeNode tnd = (TypeNode)this.node();
		Report.report(0, "Type Node: " + tnd);
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}