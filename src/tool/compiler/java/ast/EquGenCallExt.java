package tool.compiler.java.ast;

import polyglot.ast.Call;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5ProcedureInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Call <: Expr <: Term <: Node
 * @author LHJ
 */
public class EquGenCallExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Call call = (Call)this.node();
		Report.report(0, "Call: " + call.name());
		
		/* Method 사용: Call Method */
		v.markOnMethodEnv((JL5ProcedureInstance) call.procedureInstance());
		
		/* Field 사용: Call Method (호출객체) */
		if(call.target() instanceof Field) {	// call.target()이 Field 객체가 아닌 경우를 걸러냄.
			v.markOnFieldEnv((JL5FieldInstance) ((Field)call.target()).fieldInstance());
		}
		
		/* Field 사용: Arguments of Method */
		for(Expr arg : call.arguments()) {
			if(arg instanceof Field) {	// arg가 Field 객체가 아닌 경우를 걸러냄.
				v.markOnFieldEnv((JL5FieldInstance) ((Field)arg).fieldInstance());
			}
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}