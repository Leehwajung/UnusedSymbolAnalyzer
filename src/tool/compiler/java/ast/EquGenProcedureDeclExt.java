package tool.compiler.java.ast;

import polyglot.ast.Formal;
import polyglot.ast.Node;
import polyglot.ast.ProcedureDecl;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5LocalInstance;
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
		
		/* Method 환경: Declare Method */
		v.addToMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Local 환경: Current Method */
		v.setCurrentMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Local 환경/Class 사용: Arguments */
		for(Formal arg : pcdDecl.formals()) {
			/* Local 환경: Argument */
			v.addToLocalEnv((JL5LocalInstance) arg.localInstance());
			
			/* Class 사용: Argument Types of Method */
			if(arg.declType() instanceof JL5ClassType) {	// arg.declType()이 JL5ClassType 객체가 아닌 경우를 걸러냄.
				v.markOnClassEnv((JL5ClassType) arg.declType());
			}
		}
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}