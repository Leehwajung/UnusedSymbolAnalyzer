package tool.compiler.java.ast;

import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
 * MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenMethodDeclExt extends EquGenProcedureDeclExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		MethodDecl mtdDecl = (MethodDecl) this.node();
		 Report.report(0, "Method Declaration: " + mtdDecl.name());
		
		/*******************************************************************************************************************************/
		/**
		 * 형식: M(<ClassBoundVariables>, Container, method) = <BoundTypeParams> (FormalTypes)->ReturnType
		 */
////		String ClassBoundVariablesStr = toStringWithGenricBracket(
////				((JL5MethodDeclExt) JL5MethodDeclExt.ext(this.node())).typeParams());	// ClassBoundVariables가 아님
//		String ClassBoundVariablesStr = "<>";
//		
//		List<TypeVariable> BoundTypeParams = ((JL5MethodInstance)mtdDecl.methodInstance()).typeParams();
//
////		System.out.println(((MethodDecl_c)((JL5Ext)((JL7Ext)(pred())).pred())).pred())).pred()));
//		
//		Report.report(1, "M(" 
//				+ ClassBoundVariablesStr + ", "
//				+ mtdDecl.methodInstance().container() + ", " 
//				+ mtdDecl.name() + ") = " 
//				+ (!BoundTypeParams.isEmpty() ? toStringWithGenricBracket(BoundTypeParams) + " " : "")
//				+ toStringWithMethodParamBracket(mtdDecl.methodInstance().formalTypes()) + " -> "
//				+ mtdDecl.returnType());
//		
////		String formalStr = "";
////		for(Formal fom : mtdDecl.formals()) {
////			formalStr += fom.name() + ": " + fom.type() + ", ";
////		}
////		
////		Report.report(1, "Γ{" +  formalStr + "} ⊢ " + mtdDecl.methodInstance().container().fields());
		
		/*******************************************************************************************************************************/
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}