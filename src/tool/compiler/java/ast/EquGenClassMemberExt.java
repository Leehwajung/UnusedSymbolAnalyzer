package tool.compiler.java.ast;

import polyglot.ast.ClassMember;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * ClassMember <: Term <: Node
 * @author LHJ
 */
public class EquGenClassMemberExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		ClassMember clzMem = (ClassMember)this.node();
		Report.report(0, "Class Member: " + clzMem);
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}