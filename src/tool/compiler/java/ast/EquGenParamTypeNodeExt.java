package tool.compiler.java.ast;

import polyglot.ext.jl5.ast.ParamTypeNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ParamTypeNode <: TypeNode <: Term <: Node	<br>
 * ParamTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
 * ParamTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
 * @author LHJ
 */
public class EquGenParamTypeNodeExt extends EquGenTypeNodeExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ParamTypeNode ptnd = (ParamTypeNode)this.node();
		Report.report(0, "Parameter Type Node: " + ptnd);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}