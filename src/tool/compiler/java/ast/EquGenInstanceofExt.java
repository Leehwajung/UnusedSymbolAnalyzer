package tool.compiler.java.ast;

import polyglot.ast.Instanceof;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Instanceof <: Expr <: Term <: Node
 * Instanceof <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenInstanceofExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Instanceof insof = (Instanceof) this.node();
		Report.report(0, "Instanceof: " + insof);
		
		/* Class 사용: Compare Type of "instanceof" */
		v.markOnClassEnv((JL5ClassType) insof.compareType().type());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}