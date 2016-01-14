package tool.compiler.java;

import polyglot.frontend.*;
import polyglot.ast.NodeFactory;
import polyglot.ext.jl5.ast.JL5ExtFactory_c;
import polyglot.ext.jl7.ast.JL7ExtFactory_c;
//import polyglot.ext.jl7.parse.*;
//import polyglot.lex.Lexer;
//import polyglot.util.ErrorQueue;
import polyglot.types.TypeSystem;
import tool.compiler.java.ast.*;
import tool.compiler.java.types.*;

//import java.io.*;
//import java.util.Set;

/**
 * Extension information for equgen extension.
 */
public class ExtensionInfo extends polyglot.ext.jl7.JL7ExtensionInfo {
	static {
		// force Topics to load
//		Topics t = new Topics();
	}

	// 기존 폴리글롯 소스에서 아래 메소드들을 호출함!!!
	
	@Override
	public String defaultFileExtension() {
		return super.defaultFileExtension();	// 확장자
	}

	@Override
	public String compilerName() {
		return super.defaultFileExtension();	// 컴파일러 이름	// TODO: ???
	}
	
	// public Parser parser(Reader reader, Source source, ErrorQueue eq); 
	
	// public Set<String> keywords();
	
//	@Override
//	public Parser parser(Reader reader, Source source, ErrorQueue eq) {
//		Lexer lexer = new Lexer_c(reader, source, eq);
//		Grm grm = new Grm(lexer, ts, nf, eq);
//		return new CupParser(grm, source, eq); // 파서
//	}
//
//	@Override
//	public Set<String> keywords() {
//		return new Lexer_c(null).keywords();
//	}
	
	@Override
	public Scheduler createScheduler() {
		return new EquGenScheduler(this);
	}

	@Override
	protected NodeFactory createNodeFactory() {
		// return new EquGenNodeFactory_c(EquGenLang_c.instance,	// 노드 팩토리
		// new EquGenExtFactory_c());	// 확장 노드 팩토리
		return new EquGenNodeFactory_c(EquGenLang_c.instance, 
				new EquGenExtFactory_c(new JL7ExtFactory_c(new JL5ExtFactory_c())));
	}

	@Override
	protected TypeSystem createTypeSystem() {
		return new EquGenTypeSystem_c();	// 타입 시스템
	}
}