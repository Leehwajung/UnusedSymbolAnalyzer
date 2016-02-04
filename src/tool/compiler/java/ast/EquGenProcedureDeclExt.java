package tool.compiler.java.ast;

import polyglot.ast.Formal;
import polyglot.ast.Node;
import polyglot.ast.ProcedureDecl;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5ProcedureInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
 * ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenProcedureDeclExt extends EquGenCodeDeclExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ProcedureDecl pcdDecl = (ProcedureDecl) this.node();
		Report.report(0, "Procedure Declaration: " + pcdDecl.name());
		
		/* Method 환경: Declare method */
		v.addToMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Local 환경: Current method*/
		v.setCurrentMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Class 사용: Argument types of method */
		for(Formal arg : pcdDecl.formals()) {
			if(arg.declType() instanceof JL5ClassType) {	// arg.declType()이 JL5ClassType 객체가 아닌 경우를 걸러냄.
				v.markOnClassEnv((JL5ClassType) arg.declType());
			}
		}
		
		/* Class 사용: ParamTypes*/
//		for(TypeVariable arg : ((JL5ProcedureInstance)pcdDecl.procedureInstance()).typeParams()) {
//			try {
//			v.markOnClassEnv((JL5ClassType) arg.erasureType());
//			} catch (Exception e) {
//				System.out.println("@@@  " + arg.erasureType());
//			}
//		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}