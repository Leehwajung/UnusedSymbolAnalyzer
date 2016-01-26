package tool.compiler.java.ast;

import polyglot.ast.Field;
import polyglot.ast.LocalDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * LocalDecl <: ForInit <: Stmt <: Term <: Node	<br>
 * LocalDecl <: VarDecl <: Term <: Node
 * @author LHJ
 */
public class EquGenLocalDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		LocalDecl lclDecl = (LocalDecl) this.node();
		Report.report(0, "Local declaration: " + lclDecl.name());
		
		/* Class 사용: Type of declaration */
		if(lclDecl.type().type() instanceof JL5ClassType) {	// class type이 아닌 경우를 걸러냄.
			v.markOnClassEnv((JL5ClassType) lclDecl.type().type());
		}
		
		/* Field 사용: Declared as initial value */
		if(lclDecl.init() != null && lclDecl.init() instanceof Field) {	// lclDecl.init()가 Field 객체가 아닌 경우와 널인 경우를 걸러냄.
			v.markOnFieldEnv((JL5FieldInstance) ((Field)lclDecl.init()).fieldInstance());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}