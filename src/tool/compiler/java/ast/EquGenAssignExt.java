package tool.compiler.java.ast;

import polyglot.ast.Assign;
import polyglot.ast.Field;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenAssignExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Assign assign = (Assign) this.node();
		Report.report(0, "Assign: " + assign);
		
		/* Field 사용: Assigned as r-value */
		try {	// TODO: Field의 객체가 아닌 경우를 if와 instanceof를 통해 걸러낼 것인지 try-catch를 통해 걸러낼 것인지 의미 생각해서 결정하기
			v.markOnFieldEnv((JL5FieldInstance) ((Field)assign.right()).fieldInstance());
		} catch (ClassCastException ignored){
			// assign.right()가 Field 객체가 아닌 경우는 걸러냄.
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}