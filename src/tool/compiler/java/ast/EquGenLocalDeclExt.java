package tool.compiler.java.ast;

import polyglot.ast.Field;
import polyglot.ast.LocalDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5FieldInstance;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenLocalDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		LocalDecl lclDecl = (LocalDecl) this.node();
		Report.report(0, "Local declaration: " + lclDecl.name());
		
		/* Class 사용: Type of declaration */
		try {	// TODO: JL5ClassType의 객체가 아닌 경우를 if와 instanceof를 통해 걸러낼 것인지 try-catch를 통해 걸러낼 것인지 의미 생각해서 결정하기
			v.markOnClassEnv((JL5ClassType) lclDecl.type().type());
		} catch (Exception e) {
//			System.out.println(fldDecl.type().type());
			// class type이 아닌 경우를 걸러냄.
		}
		
		/* Field 사용: Declared as initial value */
		try {	// TODO: Field의 객체가 아닌 경우를 if와 instanceof를 통해 걸러낼 것인지 try-catch를 통해 걸러낼 것인지 의미 생각해서 결정하기
				// TODO: NullPointerException인 경우 또한 의미 생각해서 결정해서 걸러내기
			v.markOnFieldEnv((JL5FieldInstance) ((Field)lclDecl.init()).fieldInstance());
		} catch (ClassCastException | NullPointerException ignored){
			// lclDecl.init()가 Field 객체가 아닌 경우와 널인 경우 걸러냄.
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}