package tool.compiler.java.ast;

import polyglot.ast.LocalClassDecl;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * LocalClassDecl <: Stmt <: Term <: Node
 * @author LHJ
 */
public class EquGenLocalClassDeclExt extends EquGenStmtExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		LocalClassDecl lclzDecl = (LocalClassDecl) this.node();
		Report.report(0, "Local Class Declaration: " + lclzDecl);
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}