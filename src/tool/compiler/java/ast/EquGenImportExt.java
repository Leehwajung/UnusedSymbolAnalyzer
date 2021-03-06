package tool.compiler.java.ast;

import polyglot.ast.Import;
import polyglot.ast.Node;
import polyglot.main.Report;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * Import <: Node
 * @author LHJ
 */
public class EquGenImportExt extends EquGenExt {
	private static final long serialVersionUID = SerialVersionUID.generate();
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		Import imp = (Import) this.node();
		Report.report(0, "Import: " + imp/*.name()*/);
		
		// TODO: import 대응하기
//		System.out.println(v.context().importTable().singleTypeImports());
//		System.out.println(v.context().importTable().package_());
//		System.out.println((Importable)imp.lang());
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}