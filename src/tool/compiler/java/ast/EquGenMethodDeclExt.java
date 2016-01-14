package tool.compiler.java.ast;

import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.ast.*;
import polyglot.ext.jl5.types.*;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenMethodDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		MethodDecl mtdDecl = (MethodDecl) this.node();
		// Report.report(0, "Method declaration: " + mtdDecl.name());
		
		/**
		 * 형식: M(<ClassBoundVariables>, Container, method) = <BoundTypeParams> (FormalTypes)->ReturnType
		 */
//		List<Node> dd = visitList(new ArrayList<Node>(), v);
//		String ClassBoundVariablesStr = toStringWithGenricBracket(
//				((JL5MethodDeclExt) JL5MethodDeclExt.ext(this.node())).typeParams());
//				dd);
//		String ClassBoundVariablesStr = p;
//		v.context().currentClass().container().
		
		String ClassBoundVariablesStr = toStringWithGenricBracket(
				((JL5MethodDeclExt) JL5MethodDeclExt.ext(this.node())).typeParams());
		
		
		String BoundTypeParamsStr = toStringWithGenricBracket(
				((JL5MethodInstance)mtdDecl.methodInstance()).typeParams());

//		System.out.println(((MethodDecl_c)((JL5Ext)((JL7Ext)(pred())).pred())).pred())).pred()));
		
		Report.report(1,
				"M(" + ClassBoundVariablesStr + ", " + mtdDecl.methodInstance().container() + ", " + mtdDecl.name()
						+ ") = " + BoundTypeParamsStr + " "
						+ toStringWithMethodParamBracket(mtdDecl.methodInstance().formalTypes()) + " -> "
						+ mtdDecl.returnType());
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}

	/* (non-Javadoc)
	 * @see tool.compiler.java.ast.EquGenExt#equGenEnter(polyglot.ast.Node, tool.compiler.java.visit.EquGenerator)
	 */
//	@Override
//	public EquGenerator equGenEnter(Node parent, EquGenerator v) {
//		// TODO Auto-generated method stub
//		MethodDecl mtdDecl = (MethodDecl) this.node();
//		// Report.report(0, "Method declaration: " + mtdDecl.name());
//		
//		/**
//		 * 형식: M(<ClassBoundVariables>, Container, method) = <BoundTypeParams> (FormalTypes)->ReturnType
//		 */
//		String ClassBoundVariablesStr = toStringWithGenricBracket(
//				((JL5MethodDeclExt) JL5MethodDeclExt.ext(parent)).typeParams());
//		String BoundTypeParamsStr = toStringWithGenricBracket(
//				((JL5MethodInstance) mtdDecl.methodInstance()).typeParams());
//		
//		Report.report(1,
//				"M(" + ClassBoundVariablesStr + ", " + mtdDecl.methodInstance().container() + ", " + mtdDecl.name()
//						+ ") = " + BoundTypeParamsStr + " "
//						+ toStringWithMethodParamBracket(mtdDecl.methodInstance().formalTypes()) + " -> "
//						+ mtdDecl.returnType());
//		
//		return super.equGenEnter(v);
//	}
	
	
}