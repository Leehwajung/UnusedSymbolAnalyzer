package tool.compiler.java.ast;

import polyglot.ast.Initializer;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Initializer <: CodeDecl <: ClassMember <: Term <: Node	<br>
 * Initializer <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
 * @author LHJ
 */
public class EquGenInitializerExt extends EquGenCodeDeclExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Initializer init = (Initializer)this.node();
		Report.report(0, "Initializer: " + init);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}