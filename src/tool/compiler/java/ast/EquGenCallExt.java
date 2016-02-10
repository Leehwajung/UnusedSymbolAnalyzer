package tool.compiler.java.ast;

import polyglot.ast.Call;
import polyglot.ast.CanonicalTypeNode;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.Local;
import polyglot.ast.Node;
import polyglot.ast.Receiver;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.ext.jl5.types.JL5LocalInstance;
import polyglot.ext.jl5.types.JL5ProcedureInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Call <: Expr <: Term <: Node
 * Call <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenCallExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Call call = (Call)this.node();
		Report.report(0, "Call: " + call.name());
		
		JL5ProcedureInstance procIns = (JL5ProcedureInstance) call.procedureInstance();
		
		/* Method 사용: Call Method */
		v.markOnMethodEnv(procIns);
		
		/* Class/Field/Local 사용: Call Method */
		Receiver rcv = call.target();
		/* Class 사용: Call Static Method */
		if(rcv instanceof CanonicalTypeNode) {	// rcv가 CanonicalTypeNode 객체가 아닌 경우를 걸러냄.
			v.markOnClassEnv((JL5ClassType) rcv.type());
		}
		
		/* Field 사용: Call Method (호출객체) */
		else if(rcv instanceof Field) {	// rcv가 Field 객체가 아닌 경우를 걸러냄.
			v.markOnFieldEnv((JL5FieldInstance) ((Field)rcv).fieldInstance());
		}
		
		/* Local 사용: Call Method (호출객체) */
		else if (rcv instanceof Local) {	// rcv가 Local 객체가 아닌 경우를 걸러냄.
			v.markOnLocalEnv((JL5LocalInstance) ((Local)rcv).localInstance());
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