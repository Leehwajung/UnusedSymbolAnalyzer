package tool.compiler.java.ast;

import polyglot.ast.Node;
import polyglot.ast.PackageNode;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * PackageNode <: Node
 * @author LHJ
 */
public class EquGenPackageNodeExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		PackageNode pkgnd = (PackageNode) this.node();
		Report.report(0, "Package Node: " + pkgnd);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}