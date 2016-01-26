package tool.compiler.java.ast;

import polyglot.ast.*;
import tool.compiler.java.visit.EquGenerator;

public interface EquGenOps extends NodeOps {
	EquGenerator equGenEnter(EquGenerator v);
	Node equGen(EquGenerator v);
}