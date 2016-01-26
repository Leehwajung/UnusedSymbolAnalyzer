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
	 * Id<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extIdImpl()
	 */
	@Override
	protected Ext extIdImpl() {
		// TODO Auto-generated method stub
		return super.extIdImpl();
	}
	
	/**
	 * SourceFile<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extSourceFileImpl()
	 */
	@Override
	protected Ext extSourceFileImpl() {
		// TODO Auto-generated method stub
		return super.extSourceFileImpl();
	}
	
	/**
	 * SourceCollection<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extSourceCollectionImpl()
	 */
	@Override
	protected Ext extSourceCollectionImpl() {
		// TODO Auto-generated method stub
		return super.extSourceCollectionImpl();
	}
	
	/**
	 * Import<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extImportImpl()
	 */
	@Override
	protected Ext extImportImpl() {
		// TODO Auto-generated method stub
		return super.extImportImpl();
	}
	
	/**
	 * PackageNode<:QualifierNode<:Prefix<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extPackageNodeImpl()
	 */
	@Override
	protected Ext extPackageNodeImpl() {
		// TODO Auto-generated method stub
		return super.extPackageNodeImpl();
	}
	
	/**
	 * AmbQualifierNode<:QualifierNode<:Prefix<:Node		<br>
	 * AmbQualifierNode<:Ambiguous<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbQualifierNodeImpl()
	 */
	@Override
	protected Ext extAmbQualifierNodeImpl() {
		// TODO Auto-generated method stub
		return super.extAmbQualifierNodeImpl();
	}
	
	/**
	 * AmbReceiver<:Receiver<:Prefix<:Node		<br>
	 * AmbReceiver<:Ambiguous<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbReceiverImpl()
	 */
	@Override
	protected Ext extAmbReceiverImpl() {
		// TODO Auto-generated method stub
		return super.extAmbReceiverImpl();
	}
	
	/**
	 * AmbPrefix<:Prefix<:Node		<br>
	 * AmbPrefix<:Ambiguous<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbPrefixImpl()
	 */
	@Override
	protected Ext extAmbPrefixImpl() {
		// TODO Auto-generated method stub
		return super.extAmbPrefixImpl();
	}
	
	/**
	 * Term<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extTermImpl()
	 */
	@Override
	protected Ext extTermImpl() {
		// TODO Auto-generated method stub
		return super.extTermImpl();
	}

	/**
	 * ClassBody<:Term<:Node
	 * @see polyglot.ast.AbstractExtFactory_c#extClassBodyImpl()
	 */
	@Override
	protected Ext extClassBodyImpl() {
		// TODO Auto-generated method stub
		return super.extClassBodyImpl();
	}
	
	/**
	 * ElementValueArrayInit<:Term<:Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extElementValueArrayInitImpl()
	 */
	@Override
	protected Ext extElementValueArrayInitImpl() {
		// TODO Auto-generated method stub
		return super.extElementValueArrayInitImpl();
	}

	/**
	 * ElementValuePair<:Term<:Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extElementValuePairImpl()
	 */
	@Override
	protected Ext extElementValuePairImpl() {
		// TODO Auto-generated method stub
		return super.extElementValuePairImpl();
	}
	
	/******************
	 * ClassMember *
	 ******************/
	
	/**
	 * ClassMember<:Term<:Node
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
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumDeclImpl()
	 */
	@Override
	protected Ext extEnumDeclImpl() {
		return super.extEnumDeclImpl();
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
	
	
	/****************
	 * TypeNode *
	 ****************/
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extTypeNodeImpl()
	 */
	@Override
	protected Ext extTypeNodeImpl() {
//		return super.extTypeNodeImpl();
		return new EquGenTypeNodeExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extCanonicalTypeNodeImpl()
	 */
	@Override
	protected Ext extCanonicalTypeNodeImpl() {
//		return super.extCanonicalTypeNodeImpl();
		return new EquGenCanonicalTypeNodeExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extArrayTypeNodeImpl()
	 */
	@Override
	protected Ext extArrayTypeNodeImpl() {
//		return super.extArrayTypeNodeImpl();
		return new EquGenArrayTypeNodeExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbTypeNodeImpl()
	 */
	@Override
	protected Ext extAmbTypeNodeImpl() {
//		return super.extAmbTypeNodeImpl();
		return new EquGenAmbTypeNodeExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extParamTypeNodeImpl()
	 */
	@Override
	protected Ext extParamTypeNodeImpl() {
//		return super.extParamTypeNodeImpl();
		return new EquGenParamTypeNodeExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAmbTypeInstantiationImpl()
	 */
	@Override
	protected Ext extAmbTypeInstantiationImpl() {
		// TODO Auto-generated method stub
		return super.extAmbTypeInstantiationImpl();
	}

	/* (non-Javadoc)
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAmbWildCardImpl()
	 */
	@Override
	protected Ext extAmbWildCardImpl() {
		// TODO Auto-generated method stub
		return super.extAmbWildCardImpl();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ext.jl7.ast.JL7AbstractExtFactory_c#extAmbDiamondTypeNodeImpl()
	 */
	@Override
	protected Ext extAmbDiamondTypeNodeImpl() {
		// TODO Auto-generated method stub
		return super.extAmbDiamondTypeNodeImpl();
	}

	/* (non-Javadoc)
	 * @see polyglot.ext.jl7.ast.JL7AbstractExtFactory_c#extAmbUnionTypeImpl()
	 */
	@Override
	protected Ext extAmbUnionTypeImpl() {
		// TODO Auto-generated method stub
		return super.extAmbUnionTypeImpl();
	}
	
	/** !TypeNode **/
	
	
	/*********
	 * Stmt *
	 *********/
	
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
	 * @see polyglot.ast.AbstractExtFactory_c#extCallImpl()
	 */
	@Override
	protected Ext extCallImpl() {
//		return super.extCallImpl();
		return new EquGenCallExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extAssignImpl()
	 */
	@Override
	protected Ext extAssignImpl() {
//		return super.extAssignImpl();
		return new EquGenAssignExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extCastImpl()
	 */
	@Override
	protected Ext extCastImpl() {
//		return super.extCastImpl();
		return new EquGenCastExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extInstanceofImpl()
	 */
	@Override
	protected Ext extInstanceofImpl() {
//		return super.extInstanceofImpl();
		return new EquGenInstanceofExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extNewImpl()
	 */
	@Override
	protected Ext extNewImpl() {
//		return super.extNewImpl();
		return new EquGenNewExt();
	}
	
	/* (non-Javadoc)
	 * @see polyglot.ast.AbstractExtFactory_c#extNewArrayImpl()
	 */
	@Override
	protected Ext extNewArrayImpl() {
//		return super.extNewArrayImpl();
		return new EquGenNewArrayExt();
	}
}