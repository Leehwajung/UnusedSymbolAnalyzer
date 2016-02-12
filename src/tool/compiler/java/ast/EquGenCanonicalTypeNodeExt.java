package tool.compiler.java.ast;

import polyglot.ast.CanonicalTypeNode;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * CanonicalTypeNode <: TypeNode <: Term <: Node<br>
 * CanonicalTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
 * CanonicalTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
 * @author LHJ
 */
public class EquGenCanonicalTypeNodeExt extends EquGenTypeNodeExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		CanonicalTypeNode ctnd = (CanonicalTypeNode)this.node();
		Report.report(0, "Canonical Type Node: " + ctnd);
		
		/* Class 사용 */
		Type type = ctnd.type();
		if(type instanceof JL5ClassType) {	// class type이 아닌 경우를 걸러냄.
			v.markOnClassEnv((JL5ClassType) type);
		}
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}