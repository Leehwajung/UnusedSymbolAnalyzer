package tool.compiler.java.ast;

import polyglot.ast.Ext;
import polyglot.ast.ExtFactory;

public final class EquGenExtFactory_c extends EquGenAbstractExtFactory_c {
	
	public EquGenExtFactory_c() {
		super();
	}
	
	public EquGenExtFactory_c(ExtFactory nextExtFactory) {
		super(nextExtFactory);
	}
	
	@Override
	protected Ext extNodeImpl() {
		return new EquGenExt();
	}
	
	// TODO: Override factory methods for new extension nodes in the current
	// extension.
	
	// Decl류 구현 오버라이딩
	
	@Override
	protected Ext extClassDeclImpl() {	// 오버라이딩하고
		return new EquGenClassDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extProcedureDeclImpl()
	 */
	@Override
	protected Ext extProcedureDeclImpl() {
//		return super.extProcedureDeclImpl();
		return new EquGenProcedureDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extMethodDeclImpl()
	 */
	@Override
	protected Ext extMethodDeclImpl() {
//		return super.extMethodDeclImpl();
		return new EquGenMethodDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extConstructorDeclImpl()
	 */
	@Override
	protected Ext extConstructorDeclImpl() {
//		return super.extConstructorDeclImpl();
		return new EquGenConstructorDeclExt();
		
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extFieldDeclImpl()
	 */
	@Override
	protected Ext extFieldDeclImpl() {
//		return super.extFieldDeclImpl();
		return new EquGenFieldDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalDeclImpl()
	 */
	@Override
	protected Ext extLocalDeclImpl() {
//		return super.extLocalDeclImpl();
		return new EquGenLocalDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extCodeDeclImpl()
	 */
	@Override
	protected Ext extCodeDeclImpl() {
//		return super.extCodeDeclImpl();
		return new EquGenCodeDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalClassDeclImpl()
	 */
	@Override
	protected Ext extLocalClassDeclImpl() {
//		return super.extLocalClassDeclImpl();
		return new EquGenLocalClassDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAnnotationElemDeclImpl()
	 */
	@Override
	protected Ext extAnnotationElemDeclImpl() {
//		return super.extAnnotationElemDeclImpl();
		return new EquGenAnnotationElemDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumConstantDeclImpl()
	 */
	@Override
	protected Ext extEnumConstantDeclImpl() {
//		return super.extEnumConstantDeclImpl();
		return new EquGenEnumConstantDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumDeclImpl()
	 */
	@Override
	protected Ext extEnumDeclImpl() {
		return super.extEnumDeclImpl();
	}
}