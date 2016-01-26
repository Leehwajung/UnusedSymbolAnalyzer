package tool.compiler.java.ast;

import polyglot.ast.NewArray;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * NewArray <: Expr <: Term <: Node
 * @author LHJ
 */
public class EquGenNewArrayExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		NewArray nwArr = (NewArray) this.node();
		Report.report(0, "New Array: " + nwArr);
		
		/* Class 사용: Create new object */
		if(nwArr.baseType().type() instanceof JL5ClassType) {	// nwArr.baseType().type()이 JL5ClassType 객체가 아닌 경우를 걸러냄.
			v.markOnClassEnv((JL5ClassType) nwArr.baseType().type());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}