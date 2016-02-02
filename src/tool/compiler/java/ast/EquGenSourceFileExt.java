package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.SourceFile;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * SourceFile <: Node
 * @author LHJ
 */
public class EquGenSourceFileExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		SourceFile srcfile = (SourceFile) this.node();
		Report.report(0, "Source File: " + srcfile);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}