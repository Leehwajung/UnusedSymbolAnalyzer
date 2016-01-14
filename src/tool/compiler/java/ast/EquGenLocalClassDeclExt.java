package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenLocalClassDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
//		LocalClassDecl lclzDecl = (LocalClassDecl) this.node();
		Report.report(0, "Local Class declaration"/* + ": " + lclzDecl.name()*/);
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}