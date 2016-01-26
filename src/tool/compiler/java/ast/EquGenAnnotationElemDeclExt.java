package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ext.jl5.ast.AnnotationElemDecl;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenAnnotationElemDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		AnnotationElemDecl ateDecl = (AnnotationElemDecl) this.node();
		Report.report(0, "Annotation Elem declaration: " + ateDecl.name());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}
