package tool.compiler.java.ast;

import polyglot.ast.ClassDecl;
import polyglot.ast.Node;
//import polyglot.ext.jl5.ast.JL5ClassDeclExt;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenClassDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
//		ClassDecl clzDecl = (ClassDecl)this.node();
		ClassDecl clzDecl = (ClassDecl)this.node();
		Report.report(0, "Class declaration: " + clzDecl.name());
		
		// Report paramTypes
//		Report.report(0, "Class declaration: " + ((JL5ClassDeclExt)JL5ClassDeclExt.ext(clzDecl)).paramTypes());
			
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}