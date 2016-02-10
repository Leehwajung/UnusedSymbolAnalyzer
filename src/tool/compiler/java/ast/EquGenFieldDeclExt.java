package tool.compiler.java.ast;

import java.util.Map.Entry;

import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.FieldDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5SubstClassType;
import polyglot.ext.jl5.types.TypeVariable;
import polyglot.main.Report;
import polyglot.types.ReferenceType;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * FieldDecl <: ClassMember <: Term <: Node	<br>
 * FieldDecl <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenFieldDeclExt extends EquGenClassMemberExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		FieldDecl fldDecl = (FieldDecl) this.node();
		Report.report(0, "Field Declaration: " + fldDecl/*.name()*/);
		
		/* Field 환경: Declare Field */
		v.addToFieldEnv((JL5FieldInstance) fldDecl.fieldInstance());
		
		/* Class 사용: Type */
		Type type = fldDecl.type().type();
		if(type instanceof JL5ClassType) {	// class type이 아닌 경우를 걸러냄.
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
		
		/* Field 사용: Declared as Initial Value */
		Expr init = fldDecl.init();
		if(init != null && init instanceof Field) {	// 초기화하지 않은 - init이 null인 - 경우와 Field 객체가 아닌 경우를 걸러냄.
			v.markOnFieldEnv((JL5FieldInstance) ((Field)init).fieldInstance());
		}
		
		/**
		 *  형식: F(<ClassBoundVariables>, Container, field) = FieldType
		 */
////		String ClassBoundVariablesStr = toStringWithGenricBracket(
////				((JL5FieldDeclExt) JL5FieldDeclExt.ext(this.node())).typeParams());		// 멤버 메서드 없음
//		String ClassBoundVariablesStr = "<>";
//		
//		Report.report(1, "F(" + ClassBoundVariablesStr + ", " + fldDecl.fieldInstance().container() + ", " + fldDecl.name() + ") = " + fldDecl.type());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}