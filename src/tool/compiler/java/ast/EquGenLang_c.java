package tool.compiler.java.ast;

import polyglot.ast.*;
import polyglot.ext.jl7.ast.*;
import polyglot.util.InternalCompilerError;
import tool.compiler.java.visit.EquGenerator;

public class EquGenLang_c extends J7Lang_c implements EquGenLang {
	public static final EquGenLang_c instance = new EquGenLang_c();
	
	public static EquGenLang lang(NodeOps n) {
		while ( n != null ) {
			Lang lang = n.lang();
			if ( lang instanceof EquGenLang) return (EquGenLang)lang;
			if ( n instanceof Ext ) 
				n = ((Ext)n).pred();
			else return null;
		}
		throw new InternalCompilerError("Impossible to reach");
	}
	
	protected EquGenLang_c() {
	}
	
	protected static EquGenExt equgenExt(Node n) {
		return EquGenExt.ext(n);
	}
	
	@Override
	protected NodeOps NodeOps(Node n) {
		return equgenExt(n);
	}
	
	// TODO:  Implement dispatch methods for new AST operations.
	// TODO:  Override *Ops methods for AST nodes with new extension nodes.
	
	protected EquGenOps equgenOps(Node n) {
		return equgenExt(n);
	}
	
	@Override
	public EquGenerator equGenEnter(Node n, EquGenerator v) {
		return equgenOps(n).equGenEnter(v);
	}
	
	@Override
	public Node equGen(Node n, EquGenerator v) {
		return equgenOps(n).equGen(v);
	}
}