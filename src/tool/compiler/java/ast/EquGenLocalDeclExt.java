package tool.compiler.java.ast;

import java.util.Map.Entry;

import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5LocalInstance;
import polyglot.ext.jl5.types.JL5SubstClassType;
import polyglot.ext.jl5.types.TypeVariable;
import polyglot.main.Report;
import polyglot.types.ReferenceType;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * LocalDecl <: ForInit <: Stmt <: Term <: Node	<br>
 * LocalDecl <: VarDecl <: Term <: Node
 * @author LHJ
 */
public class EquGenLocalDeclExt extends EquGenStmtExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		LocalDecl lclDecl = (LocalDecl) this.node();
		Report.report(0, "Local Declaration: " + lclDecl.name());
		
		/* Local 환경: Declare Local Variable */
		v.addToLocalEnv((JL5LocalInstance) lclDecl.localInstance());
		
		/* Class 사용: Type */
		Type type = lclDecl.type().type();
		if (type instanceof JL5ClassType) { // class type이 아닌 경우를 걸러냄.
			/* Class 사용: Substitution Type of Declaration */
			if (type instanceof JL5SubstClassType) {	// JL5SubstClassType 객체가 아닌 경우를 걸러냄.
				v.markOnClassEnv(((JL5SubstClassType) type).base());			// Base
				for(Entry<TypeVariable, ReferenceType> substType: ((JL5SubstClassType) type).subst().substitutions().entrySet()) {
					v.markOnClassEnv((JL5ClassType) substType.getValue());	// Substitutions
				}
			}
			
			/* Class 사용: Type of Declaration */
			else {
				v.markOnClassEnv((JL5ClassType) type);
			}
		}
		
		/* Field/Local 사용: Declared as Initial Value */
		Expr init = lclDecl.init();
		if(init != null) {	// 초기화하지 않은 - init이 null인 - 경우를 걸러냄
			/* Field 사용: Declared as Initial Value */
			if(init instanceof Field) {			// Field 객체가 아닌 경우를 걸러냄.
				v.markOnFieldEnv((JL5FieldInstance) ((Field)init).fieldInstance());
			}
			
			/* Local 사용: Declared as Initial Value */
			else if(init instanceof Local) {	// Local 객체가 아닌 경우를 걸러냄.
				v.markOnLocalEnv((JL5LocalInstance) ((Local)init).localInstance());
			}
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}