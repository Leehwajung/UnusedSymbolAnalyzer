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

	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extClassDeclImpl()
	 */
	@Override
	protected Ext extClassDeclImpl() {
		return super.extClassDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extProcedureDeclImpl()
	 */
	@Override
	protected Ext extProcedureDeclImpl() {
		return super.extProcedureDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extMethodDeclImpl()
	 */
	@Override
	protected Ext extMethodDeclImpl() {
		return super.extMethodDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extConstructorDeclImpl()
	 */
	@Override
	protected Ext extConstructorDeclImpl() {
		return super.extConstructorDeclImpl();
		
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extFieldDeclImpl()
	 */
	@Override
	protected Ext extFieldDeclImpl() {
		return super.extFieldDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalDeclImpl()
	 */
	@Override
	protected Ext extLocalDeclImpl() {
		return super.extLocalDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extCodeDeclImpl()
	 */
	@Override
	protected Ext extCodeDeclImpl() {
		return super.extCodeDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalClassDeclImpl()
	 */
	@Override
	protected Ext extLocalClassDeclImpl() {
		return super.extLocalClassDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAnnotationElemDeclImpl()
	 */
	@Override
	protected Ext extAnnotationElemDeclImpl() {
		return super.extAnnotationElemDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumConstantDeclImpl()
	 */
	@Override
	protected Ext extEnumConstantDeclImpl() {
		return super.extEnumConstantDeclImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumDeclImpl()
	 */
	@Override
	protected Ext extEnumDeclImpl() {
		return super.extEnumDeclImpl();
	}
}