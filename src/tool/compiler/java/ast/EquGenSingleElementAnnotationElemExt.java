package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.Term;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Term <: Node
 * @author LHJ
 */
public class EquGenSingleElementAnnotationElemExt extends EquGenNormalAnnotationElemExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Term seae = (Term)this.node();
		Report.report(0, "Single Element Annotation Element: " + seae);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}