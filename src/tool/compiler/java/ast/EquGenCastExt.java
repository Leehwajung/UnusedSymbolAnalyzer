package tool.compiler.java.ast;

import polyglot.ast.Cast;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenCastExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Cast cast = (Cast) this.node();
		Report.report(0, "Cast: " + cast);
		
		/* Class 사용: Casting type */
		try {	// TODO: JL5ClassType의 객체가 아닌 경우를 if와 instanceof를 통해 걸러낼 것인지 try-catch를 통해 걸러낼 것인지 의미 생각해서 결정하기
			v.markOnClassEnv((JL5ClassType) cast.type());
//			System.out.println(cast.type());
		} catch (ClassCastException ignored) {
			// cast.type()이 JL5ClassType 객체가 아닌 경우는 걸러냄.
//			System.out.println(cast.type());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}