package tool.compiler.java.ast;

import polyglot.ast.Cast;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Cast <: Expr <: Term <: Node
 * @author LHJ
 */
public class EquGenCastExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Cast cast = (Cast) this.node();
		Report.report(0, "Cast: " + cast);
		
		/* Class 사용: Casting type */
		if(cast.type() instanceof JL5ClassType) {	// cast.type()이 JL5ClassType 객체가 아닌 경우를 걸러냄. (기본타입)
			v.markOnClassEnv((JL5ClassType) cast.type());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}