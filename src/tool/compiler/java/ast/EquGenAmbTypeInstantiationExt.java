package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.TypeNode;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * TypeNode <: Term <: Node	<br>
 * TypeNode <: Receiver <: Prefix <: Node	<br>
 * TypeNode <: QualifierNode <: Prefix <: Node
 * @author LHJ
 */
public class EquGenAmbTypeInstantiationExt extends EquGenTypeNodeExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		TypeNode ati = (TypeNode)this.node();
		Report.report(0, "Ambiguous Type Instantiation: " + ati);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}