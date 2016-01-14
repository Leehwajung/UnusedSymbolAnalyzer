package tool.compiler.java;

import tool.compiler.java.ast.*;
import tool.compiler.java.types.*;
import polyglot.ast.*;
import polyglot.ext.jl5.ast.*;
import polyglot.ext.jl7.ast.*;
import polyglot.frontend.*;
import polyglot.types.*;

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
		return super.defaultFileExtension();	// 확장자
	}
	
	@Override
	public String compilerName() {
		return super.defaultFileExtension();	// 컴파일러 이름	// TODO: ???
	}
	
	// public Parser parser(Reader reader, Source source, ErrorQueue eq); 
	
	// public Set<String> keywords();
	
	@Override
	protected NodeFactory createNodeFactory() {
		// return new EquGenNodeFactory_c(EquGenLang_c.instance,	// 노드 팩토리
		// new EquGenExtFactory_c());	// 확장 노드 팩토리
		return new EquGenNodeFactory_c(EquGenLang_c.instance,							// 노드 팩토리
				new EquGenExtFactory_c(new JL7ExtFactory_c(new JL5ExtFactory_c())));	// 확장 노드 팩토리
	}
	
	@Override
	protected TypeSystem createTypeSystem() {
		return new EquGenTypeSystem_c();	// 타입 시스템
	}
	
	@Override
	public Scheduler createScheduler() {
		return new EquGenScheduler(this);
	}
}