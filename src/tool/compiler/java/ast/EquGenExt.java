package tool.compiler.java.ast;

import java.util.HashSet;
import java.util.StringTokenizer;

import polyglot.ast.*;
import polyglot.types.ReferenceType;
import polyglot.util.InternalCompilerError;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

public class EquGenExt extends Ext_c implements EquGenOps {
	// TODO: Not JL7Ext, but Ext_c to override lang()!!!
	private static final long serialVersionUID = SerialVersionUID.generate();

	private static final String GENERICDELIM = "<,>";
	
	public static EquGenExt ext(Node n) {
		Ext e = n.ext();
		while (e != null && !(e instanceof EquGenExt)) {
			e = e.ext();
		}
		if (e == null) {
			throw new InternalCompilerError(
					"No equgen extension object for node" + n + " (" + n.getClass() + ")", n.position());
		}

		return (EquGenExt) e;
	}

	@Override // TODO: Must extend Ext_c, not JL7Ext!!!
	public final EquGenLang lang() {
		return EquGenLang_c.instance;
	}

	// TODO: Override operation methods for overridden AST operations.
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		// By default, return the given visitor.
		return v;
	}

	@Override
	public Node equGen(EquGenerator v) {
		// By default, do nothing.
		return node();
	}
	
	protected final HashSet<String> getContainerTypeParamNames(ReferenceType container) {
		HashSet<String> boundVars = new HashSet<>();
		StringTokenizer tokenizer = new StringTokenizer(container.toString(), GENERICDELIM);
		tokenizer.nextToken();
		while(tokenizer.hasMoreTokens()){
			boundVars.add(tokenizer.nextToken());
		}
		return boundVars;
	}
}