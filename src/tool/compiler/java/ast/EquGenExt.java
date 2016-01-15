package tool.compiler.java.ast;

import polyglot.ast.*;
import polyglot.util.InternalCompilerError;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

import java.util.Iterator;
import java.util.List;

public class EquGenExt extends Ext_c implements EquGenOps {
	// TODO: Not JL7Ext, but Ext_c to override lang()!!!
	private static final long serialVersionUID = SerialVersionUID.generate();

	private static final char GenricBracketLeft = '<';
	private static final char GenricBracketRight = '>';
	private static final char MethodParamBracketLeft = '(';
	private static final char MethodParamBracketRight = ')';
	
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
	
//	protected final HashSet<String> getContainerTypeParamNames(ReferenceType container) {
//		HashSet<String> boundVars = new HashSet<>();
//		StringTokenizer tokenizer = new StringTokenizer(container.toString(), GENERICDELIM);
//		tokenizer.nextToken();
//		while(tokenizer.hasMoreTokens()){
//			boundVars.add(tokenizer.nextToken());
//		}
//		return boundVars;
//	}
	
	protected static final String toStringWithGenricBracket(List<?> list) {
		return GenricBracketLeft + toStringWithNoBracket(list) +GenricBracketRight;
	}
	
	protected static final String toStringWithMethodParamBracket(List<?> list) {
		return MethodParamBracketLeft + toStringWithNoBracket(list) + MethodParamBracketRight;
	}
	
	// String conversion

	/**
	 * Returns a string representation of list. The string representation 
	 * consists of a list of the list's elements in the order they are returned 
	 * by its iterator. Adjacent elements are separated by the characters
	 * <tt>", "</tt> (comma and space). Elements are converted to strings
	 * as by {@link String#valueOf(Object)}.
	 *
	 * @param list List object to represent string
	 * @return a string representation of list
	 */
	private static final String toStringWithNoBracket(List<?> list) {
		Iterator<?> it = list.iterator();
		
		if (!it.hasNext())
			return "";
		
		StringBuilder sb = new StringBuilder();
		for (;;) {
			sb.append(it.next());
			if (!it.hasNext())
				return sb.toString();
			sb.append(',').append(' ');
		}
	}

//	@Override
//	public EquGenerator equGenEnter(Node parent, EquGenerator v) {
//		// TODO Auto-generated method stub
//		return v;
//	}
}