package tool.compiler.java.ast;

import polyglot.ast.Formal;
import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.*;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

import java.util.List;

/**
 * MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
 * MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenMethodDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		MethodDecl mtdDecl = (MethodDecl) this.node();
		 Report.report(0, "Method declaration: " + mtdDecl.name());
		
		/* Method 환경: Declare Method */
		v.addToMethodEnv((JL5ProcedureInstance)mtdDecl.procedureInstance());
		// TODO: 상속관계 정해지면 EquGenProcedureDeclExt로 옮기기
		
		/* Class 사용: Argument types of Method */
		for(Formal arg : mtdDecl.formals()) {
			if(arg.declType() instanceof JL5ClassType) {	// arg.declType()이 JL5ClassType 객체가 아닌 경우를 걸러냄.
				v.markOnClassEnv((JL5ClassType) arg.declType());
			}
		}
		
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