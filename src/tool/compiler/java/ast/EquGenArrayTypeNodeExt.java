package tool.compiler.java.ast;

import polyglot.ast.ArrayTypeNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ArrayTypeNode <: TypeNode <: Term <: Node	<br>
 * ArrayTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
 * ArrayTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node	<br>
 * ArrayTypeNode <: Ambiguous <: Node
 * @author LHJ
 */
public class EquGenArrayTypeNodeExt extends EquGenTypeNodeExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ArrayTypeNode atnd = (ArrayTypeNode)this.node();
		Report.report(0, "Array Type Node: " + atnd);
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}