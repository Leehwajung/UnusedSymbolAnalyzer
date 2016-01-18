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
	
	
	/**
	 *  ClassMember
	 */
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extClassMemberImpl()
	 */
	@Override
	protected Ext extClassMemberImpl() {
//		return super.extClassMemberImpl();
		return new EquGenClassMemberExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extClassDeclImpl()
	 */
	@Override
	protected Ext extClassDeclImpl() {	// 오버라이딩하고
//		return super.extClassDeclImpl();
		return new EquGenClassDeclExt();
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
	 * @see polyglot.ast.AbstractExtFactory_c#extCodeDeclImpl()
	 */
	@Override
	protected Ext extCodeDeclImpl() {
//		return super.extCodeDeclImpl();
		return new EquGenCodeDeclExt();
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
	 * @see polyglot.ast.AbstractExtFactory_c#extConstructorDeclImpl()
	 */
	@Override
	protected Ext extConstructorDeclImpl() {
//		return super.extConstructorDeclImpl();
		return new EquGenConstructorDeclExt();
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
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAnnotationElemDeclImpl()
	 */
	@Override
	protected Ext extAnnotationElemDeclImpl() {
//		return super.extAnnotationElemDeclImpl();
		return new EquGenAnnotationElemDeclExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extInitializerImpl()
	 */
	@Override
	protected Ext extInitializerImpl() {
//		return super.extInitializerImpl();
		return new EquGenInitializerExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumConstantDeclImpl()
	 */
	@Override
	protected Ext extEnumConstantDeclImpl() {
//		return super.extEnumConstantDeclImpl();
		return new EquGenEnumConstantDeclExt();
	}
	
	/** !ClassMember **/
	
	/**
	 * Stmt
	 */
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extStmtImpl()
	 */
	@Override
	protected Ext extStmtImpl() {
//		return super.extStmtImpl();
		return new EquGenStmtExt();
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
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalClassDeclImpl()
	 */
	@Override
	protected Ext extLocalClassDeclImpl() {
//		return super.extLocalClassDeclImpl();
		return new EquGenLocalClassDeclExt();
	}
	
	/** !Stmt **/
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumDeclImpl()
	 */
	@Override
	protected Ext extEnumDeclImpl() {
		return super.extEnumDeclImpl();
	}
}