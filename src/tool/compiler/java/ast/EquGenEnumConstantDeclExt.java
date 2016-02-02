package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ext.jl5.ast.EnumConstantDecl;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * EnumConstantDecl <: ClassMember <: Term <: Node
 * @author LHJ
 */
public class EquGenEnumConstantDeclExt extends EquGenClassMemberExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		EnumConstantDecl ectDecl = (EnumConstantDecl) this.node();
		Report.report(0, "Enum Constant declaration: " + ectDecl.name());
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}