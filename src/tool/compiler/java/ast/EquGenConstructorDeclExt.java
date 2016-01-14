package tool.compiler.java.ast;

import polyglot.ast.ConstructorDecl;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenConstructorDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ConstructorDecl cstDecl = (ConstructorDecl) this.node();
		Report.report(0, "Constructor declaration: " + cstDecl.name());
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}