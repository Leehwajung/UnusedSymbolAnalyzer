package tool.compiler.java.ast;

import polyglot.ast.ClassDecl;
import polyglot.ast.Node;
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
		
		/* Class 환경: Class Declaration */
		v.addToClassEnv((JL5ClassType) clzDecl.type());
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}