package tool.compiler.java.ast;

import polyglot.ast.*;
import polyglot.util.SerialVersionUID;
import polyglot.main.Report;
import tool.compiler.java.visit.EquGenerator;

public class EquGenClassDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ClassDecl clzDecl = (ClassDecl) this.node();
		Report.report(0, "Class declaration: " + clzDecl.name());
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}