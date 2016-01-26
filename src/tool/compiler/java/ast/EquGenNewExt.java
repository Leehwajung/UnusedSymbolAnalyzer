package tool.compiler.java.ast;

import polyglot.ast.New;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * New <: Expr <: Term <: Node
 * @author LHJ
 */
public class EquGenNewExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		New nw = (New) this.node();
		Report.report(0, "New: " + nw);
		
		/* Class 사용: Type of new object */
		v.markOnClassEnv((JL5ClassType) nw.type());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}