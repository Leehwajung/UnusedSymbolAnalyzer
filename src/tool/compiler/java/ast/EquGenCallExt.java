package tool.compiler.java.ast;

import polyglot.ast.Call;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.Local;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5LocalInstance;
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
		
		/* Local 사용: Call Method (호출객체) */
		else if (call.target() instanceof Local) {	// call.target()이 Local 객체가 아닌 경우를 걸러냄.
			v.markOnLocalEnv((JL5LocalInstance) ((Local)call.target()).localInstance());
		}
		
		/* Field/Local 사용: Arguments of Method */
		for(Expr arg : call.arguments()) {
			/* Field 사용: Arguments of Method */
			if(arg instanceof Field) {	// arg가 Field 객체가 아닌 경우를 걸러냄.
				v.markOnFieldEnv((JL5FieldInstance) ((Field)arg).fieldInstance());
			}
			
			/* Local 사용: Arguments of Method */
			else if(arg instanceof Local) {	// arg가 Local 객체가 아닌 경우를 걸러냄.
				v.markOnLocalEnv((JL5LocalInstance) ((Local)arg).localInstance());
			}
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}