package tool.compiler.java.ast;

import polyglot.ast.ClassDecl;
import polyglot.ast.Node;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.ast.JL5ClassDeclExt;
import polyglot.ext.jl5.ast.ParamTypeNode;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

import java.util.List;

public class EquGenClassDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ClassDecl clzDecl = (ClassDecl)this.node();
//		Report.report(0, "Class declaration: " + clzDecl.name());
		
		/* Class 환경: Declare Class */
		v.addToClassEnv((JL5ClassType) clzDecl.type());
		
		/* Class 사용: Type as superclass (Extends) */
		try {	// TODO: 부모클래스가 없는 경우를 if와 instanceof를 통해 걸러낼 것인지 try-catch를 통해 걸러낼 것인지 의미 생각해서 결정하기
				v.markOnClassEnv((JL5ClassType) clzDecl.superClass().type());
		} catch(NullPointerException ignored) {
			// 부모클래스가 없는 경우를 걸러냄
		}
		
		/* Class 사용: Type as Interface (Implements) */
		for(TypeNode arg : clzDecl.interfaces()) {
				v.markOnClassEnv((JL5ClassType) arg.type());
		}
		/**/
		List<ParamTypeNode> paramTypes = ((JL5ClassDeclExt)JL5ClassDeclExt.ext(clzDecl)).paramTypes();
		Report.report(0, "Class declaration: " + clzDecl.name() + (!paramTypes.isEmpty()? toStringWithGenricBracket(paramTypes) : ""));
//		((JL5ClassType)(v.context().currentClass())).
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}