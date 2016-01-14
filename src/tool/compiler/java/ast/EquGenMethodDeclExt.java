package tool.compiler.java.ast;

import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.*;
import polyglot.main.Report;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class EquGenMethodDeclExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		MethodDecl mtdDecl = (MethodDecl) this.node();
//		Report.report(0, "Method declaration: " + mtdDecl.name());
		
		/**
		 * 형식: M(Container, method) = (FormalTypes)->ReturnType
		 */
		// 
		String typeParamsStr = "";
		
		HashSet<String> boundVars = getContainerTypeParamNames(mtdDecl.methodInstance().container());
		
		// 
		List<TypeVariable> typeParams = ((JL5MethodInstance) mtdDecl.methodInstance()).typeParams();
		for(TypeVariable type: typeParams) {
			boundVars.add(type.toString());
		}
		
//		if(!typeParams.isEmpty()) {
//			typeParamsStr = typeParams.toString() + ", ";
//		}
		
		// Ver. 2 Bound Variables---------------------------------------------------------------------------------------------------------------
//		HashSet<String> boundVars = new HashSet<>();
//		StringTokenizer tokenizer = new StringTokenizer(mtdDecl.methodInstance().container().toString(), GENERICDELIM);
//		tokenizer.nextToken();
//		if(tokenizer.hasMoreTokens()) boundVars.add(tokenizer.nextToken());
		//-------------------------------------------------------------------------------------------------------------------------------------------
		
		// 
		String formalTypesStr = "";
		Iterator<? extends Type> formalTypesIterator = mtdDecl.methodInstance().formalTypes().iterator();
		boolean hasNext = formalTypesIterator.hasNext();
		if(hasNext) do {
			formalTypesStr += formalTypesIterator.next();
			
			// ------------------------------------------------------------
//			Type formalType = formalTypesIterator.next();
//			formalTypesStr += formalType;
//			tokenizer = new StringTokenizer(formalType.toString(), GENERICDELIM);
//			tokenizer.nextToken();
//			if(tokenizer.hasMoreTokens()) boundVars.add(tokenizer.nextToken());
			//-----------------------------------------------------------------------------------------
			
			hasNext = formalTypesIterator.hasNext();
			if(hasNext) {
				formalTypesStr += ", ";
			}
		} while(hasNext);
		
		//-----------------
		if(!boundVars.isEmpty()) {
			typeParamsStr += boundVars + ", ";
		}
		//---------------------------------------------
		
		// Report
		Report.report(1, "M(" + typeParamsStr + mtdDecl.methodInstance().container() + ", " + mtdDecl.name() + ") = (" + formalTypesStr/*mtdDecl.methodInstance().formalTypes()*/ + ") -> " + mtdDecl.returnType());
		
		return super.equGenEnter(v);
	}
	
	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}