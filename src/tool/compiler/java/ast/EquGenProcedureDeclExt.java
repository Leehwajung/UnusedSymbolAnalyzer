package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.ProcedureDecl;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
 * ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenProcedureDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ProcedureDecl pcdDecl = (ProcedureDecl) this.node();
		Report.report(0, "Procedure declaration: " + pcdDecl.name());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}