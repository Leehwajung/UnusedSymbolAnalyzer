package tool.compiler.java.ast;

import polyglot.ast.ClassDecl;
import polyglot.ast.Node;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ClassDecl <: ClassMember <: Term <: Node
 * @author LHJ
 */
public class EquGenClassDeclExt extends EquGenClassMemberExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ClassDecl clzDecl = (ClassDecl)this.node();
		Report.report(0, "Class Declaration: " + clzDecl.name());
		
		/* Class 환경: Declare Class */
		v.addToClassEnv((JL5ClassType) clzDecl.type());
		
		/* Class 사용: Type as Superclass (Extends) */
		if(clzDecl.superClass() != null) {	// 부모클래스가 없는 경우를 걸러냄
			v.markOnClassEnv((JL5ClassType) clzDecl.superClass().type());
		}
		
		/* Class 사용: Type as Interface (Implements) */
		for(TypeNode arg : clzDecl.interfaces()) {
			v.markOnClassEnv((JL5ClassType) arg.type());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}