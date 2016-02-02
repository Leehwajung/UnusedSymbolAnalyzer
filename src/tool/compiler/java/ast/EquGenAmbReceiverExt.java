package tool.compiler.java.ast;

import polyglot.ast.AmbReceiver;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * AmbReceiver <: Receiver <: Prefix <: Node		<br>
 * AmbReceiver <: Ambiguous <: Node
 * @author LHJ
 */
public class EquGenAmbReceiverExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		AmbReceiver arcv = (AmbReceiver)this.node();
		Report.report(0, "Ambiguous receiver: " + arcv);
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}