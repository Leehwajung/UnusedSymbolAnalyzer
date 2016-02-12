package tool.compiler.java.ast;

import polyglot.ast.New;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5ParsedClassType;
import polyglot.main.Report;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * New <: Expr <: Term <: Node
 * New <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenNewExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		New nw = (New) this.node();
		Report.report(0, "New: " + nw);
		
		Type type = nw.type();
		/* Class 사용: Type of new object */
		v.markOnClassEnv((JL5ClassType)type);
		
		/* Class 사용: Super class of Anonymous Subclass */
		if(type instanceof JL5ParsedClassType) {
			if(((JL5ParsedClassType)type).pclass() == null) {
				// new 할 때 자식 클래스 정의하므로 이름이 없어 Parsed Class가 없음(null).
				v.markOnClassEnv((JL5ClassType) ((JL5ClassType) type).superType());
			}
		}
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}