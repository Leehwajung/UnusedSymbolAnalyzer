package tool.compiler.java.ast;

import java.util.Map.Entry;

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
		
		/* Field 환경: Field Declaration*/
		v.addToFieldEnv((JL5FieldInstance) fldDecl.fieldInstance());
		
		/* Class 사용: Declaration Type */
		Type type = fldDecl.type().type();
		if(type instanceof JL5ClassType) {	// 타입이 클래스 타입인 경우
			v.markOnClassEnv((JL5ClassType) type);
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