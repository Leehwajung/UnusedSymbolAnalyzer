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
		
		/* Local 환경: Declare local variable */
		v.addToLocalEnv((JL5LocalInstance) lclDecl.localInstance());
		
		/* Class 사용: Type */
		Type type = lclDecl.type().type();
		if (type instanceof JL5ClassType) { // class type이 아닌 경우를 걸러냄.
			/* Class 사용: Substitution type of declaration */
			if (type instanceof JL5SubstClassType) {	// JL5SubstClassType 객체가 아닌 경우를 걸러냄.
				v.markOnClassEnv(((JL5SubstClassType) type).base());			// Base
				for(Entry<TypeVariable, ReferenceType> substType: ((JL5SubstClassType) type).subst().substitutions().entrySet()) {
					v.markOnClassEnv((JL5ClassType) substType.getValue());	// Substitutions
				}
			}
			
			/* Class 사용: Type of declaration */
			else {
				v.markOnClassEnv((JL5ClassType) type);
			}
		}
		
		/* Field/Local 사용: Declared as initial value */
		Expr init = lclDecl.init();
		if(init != null) {
			/* Field 사용: Declared as initial value */
			if(init instanceof Field) {	// init이 null인 경우와 Field 객체가 아닌 경우를 걸러냄.
				v.markOnFieldEnv((JL5FieldInstance) ((Field)init).fieldInstance());
			}
			
			/* Local 사용: Declared as initial value */
			else if(init instanceof Local) {	// init이 null인 경우와 Local 객체가 아닌 경우를 걸러냄.
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