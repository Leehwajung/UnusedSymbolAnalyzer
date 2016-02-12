package tool.compiler.java.ast;

import polyglot.ast.FieldDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.main.Report;
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