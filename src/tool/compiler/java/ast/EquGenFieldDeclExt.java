package tool.compiler.java.ast;

import polyglot.ast.FieldDecl;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenFieldDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		FieldDecl fldDecl = (FieldDecl) this.node();
//		Report.report(0, "Field declaration: " + fldDecl.name());
		
		/**
		 *  형식: F(Container, field) = FieldType
		 */
//		// Ver. 2 Bound Variables-------------------------------------------------------------------------------------
//		HashSet<String> boundVars = getContainerTypeParamNames(fldDecl.fieldInstance().container());
//		String typeParamsStr = "";
//		if(!boundVars.isEmpty()) {
//			typeParamsStr += boundVars + ", ";
//		}
//		//-----------------------------------------------------------------------------------------------------------------
		
		Report.report(1, "F(" + /*typeParamsStr+*/ fldDecl.fieldInstance().container() + ", " + fldDecl.name() + ") = " + fldDecl.type());
//		 fldDecl.memberInstance().
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}