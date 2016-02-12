package tool.compiler.java.ast;

import polyglot.ast.Formal;
import polyglot.ast.Node;
import polyglot.ast.ProcedureDecl;
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
		
		/* Method 환경: Method Declaration */
		v.addToMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Local 환경: Current Method */
		v.setCurrentMethodEnv((JL5ProcedureInstance)pcdDecl.procedureInstance());
		
		/* Local 환경: Argument */
		for(Formal arg : pcdDecl.formals()) {
			v.addToLocalEnv((JL5LocalInstance) arg.localInstance());
		}
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}