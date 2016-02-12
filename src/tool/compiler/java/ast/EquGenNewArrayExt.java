package tool.compiler.java.ast;

import polyglot.ast.NewArray;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * NewArray <: Expr <: Term <: Node
 * NewArray <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenNewArrayExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		NewArray nwArr = (NewArray) this.node();
		Report.report(0, "New Array: " + nwArr);
		
		/* Class 사용: Base Type of New Array */
		if(nwArr.baseType().type() instanceof JL5ClassType) {	// 베이스 타입이 클래스 타입인 경우
			v.markOnClassEnv((JL5ClassType) nwArr.baseType().type());
		}
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}