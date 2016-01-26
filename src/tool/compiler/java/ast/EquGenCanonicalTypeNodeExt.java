package tool.compiler.java.ast;

import polyglot.ast.CanonicalTypeNode;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenCanonicalTypeNodeExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		CanonicalTypeNode ctnd = (CanonicalTypeNode)this.node();
		Report.report(0, "Canonical Type Node: " + ctnd);
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}