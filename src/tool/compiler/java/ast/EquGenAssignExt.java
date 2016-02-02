package tool.compiler.java.ast;

import polyglot.ast.Assign;
import polyglot.ast.Field;
import polyglot.ast.Local;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5LocalInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Assign <: Expr <: Term <: Node
 * Assign <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenAssignExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Assign asgn = (Assign) this.node();
		Report.report(0, "Assign: " + asgn);
		
		/* Field 사용: Assigned as r-value */
		if(asgn.right() instanceof Field) {	// assign.right()가 Field 객체가 아닌 경우를 걸러냄.
			v.markOnFieldEnv((JL5FieldInstance) ((Field)asgn.right()).fieldInstance());
		}
		
		/* Local 사용: Assigned as r-value */
		else if(asgn.right() instanceof Local) {	// assign.right()가 Local 객체가 아닌 경우를 걸러냄.
			v.markOnLocalEnv((JL5LocalInstance) ((Local)asgn.right()).localInstance());
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}