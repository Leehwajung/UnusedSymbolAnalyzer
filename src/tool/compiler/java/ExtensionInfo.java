package tool.compiler.java;

//import polyglot.lex.Lexer;
//import tool.compiler.java.parse.Lexer_c;
//import tool.compiler.java.parse.Grm;
import tool.compiler.java.ast.*;
import tool.compiler.java.types.*;
import polyglot.ast.*;
import polyglot.ext.jl5.ast.*;
import polyglot.ext.jl7.ast.*;
import polyglot.frontend.*;
import polyglot.types.*;
//import polyglot.util.*;

//import java.io.*;
//import java.util.Set;

/**
 * Extension information for equgen extension.
 */
public class ExtensionInfo extends polyglot.ext.jl7.JL7ExtensionInfo {
	static {
		// force Topics to load
		@SuppressWarnings("unused")
		Topics t = new Topics();
	}
	
	@Override
	public String defaultFileExtension() {
		return super.defaultFileExtension();
	}
	
	@Override
	public String compilerName() {
		return super.defaultFileExtension();
	}
	
//	@Override
//	public Parser parser(Reader reader, Source source, ErrorQueue eq) {
//		Lexer lexer = new Lexer_c(reader, source, eq);
//		Grm grm = new Grm(lexer, ts, nf, eq);
//		return new CupParser(grm, source, eq);
//	}
	
//	@Override
//	public Set<String> keywords() {
//		return new Lexer_c(null).keywords();
//	}
	
	@Override
	protected NodeFactory createNodeFactory() {
		return new EquGenNodeFactory_c(EquGenLang_c.instance,
				new EquGenExtFactory_c(new JL7ExtFactory_c(new JL5ExtFactory_c())));
	}
	
	@Override
	protected TypeSystem createTypeSystem() {
		return new EquGenTypeSystem_c();
	}
	
	@Override
	public Scheduler createScheduler() {
		return new EquGenScheduler(this);
	}
}