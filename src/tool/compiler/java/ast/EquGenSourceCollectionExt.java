package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.SourceCollection;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * SourceCollection <: Node
 * @author LHJ
 */
public class EquGenSourceCollectionExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		SourceCollection srccol = (SourceCollection) this.node();
		Report.report(0, "Source Collection: " + srccol);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}