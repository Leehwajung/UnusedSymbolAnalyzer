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
	 * Id <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extIdImpl()
	 */
	@Override
	protected Ext extIdImpl() {
		// TODO Auto-generated method stub
		return super.extIdImpl();
	}
	
	/**
	 * SourceFile <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extSourceFileImpl()
	 */
	@Override
	protected Ext extSourceFileImpl() {
		// TODO Auto-generated method stub
		return super.extSourceFileImpl();
	}
	
	/**
	 * SourceCollection <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extSourceCollectionImpl()
	 */
	@Override
	protected Ext extSourceCollectionImpl() {
		// TODO Auto-generated method stub
		return super.extSourceCollectionImpl();
	}
	
	/**
	 * Import <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extImportImpl()
	 */
	@Override
	protected Ext extImportImpl() {
//		return super.extImportImpl();
		return new EquGenImportExt();
	}
	
	/**
	 * PackageNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extPackageNodeImpl()
	 */
	@Override
	protected Ext extPackageNodeImpl() {
		// TODO Auto-generated method stub
		return super.extPackageNodeImpl();
	}
	
	/**
	 * AmbQualifierNode <: QualifierNode <: Prefix <: Node		<br>
	 * AmbQualifierNode <: Ambiguous <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbQualifierNodeImpl()
	 */
	@Override
	protected Ext extAmbQualifierNodeImpl() {
		// TODO Auto-generated method stub
		return super.extAmbQualifierNodeImpl();
	}
	
	/**
	 * AmbReceiver <: Receiver <: Prefix <: Node		<br>
	 * AmbReceiver <: Ambiguous <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbReceiverImpl()
	 */
	@Override
	protected Ext extAmbReceiverImpl() {
		// TODO Auto-generated method stub
		return super.extAmbReceiverImpl();
	}
	
	/**
	 * AmbPrefix <: Prefix <: Node		<br>
	 * AmbPrefix <: Ambiguous <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbPrefixImpl()
	 */
	@Override
	protected Ext extAmbPrefixImpl() {
		// TODO Auto-generated method stub
		return super.extAmbPrefixImpl();
	}
	
	/**
	 * Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extTermImpl()
	 */
	@Override
	protected Ext extTermImpl() {
		// TODO Auto-generated method stub
		return super.extTermImpl();
	}

	/**
	 * ClassBody <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extClassBodyImpl()
	 */
	@Override
	protected Ext extClassBodyImpl() {
		// TODO Auto-generated method stub
		return super.extClassBodyImpl();
	}
	
	/**
	 * ElementValueArrayInit <: Term <: Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extElementValueArrayInitImpl()
	 */
	@Override
	protected Ext extElementValueArrayInitImpl() {
		// TODO Auto-generated method stub
		return super.extElementValueArrayInitImpl();
	}

	/**
	 * ElementValuePair <: Term <: Node
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
	 * ClassMember <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extClassMemberImpl()
	 */
	@Override
	protected Ext extClassMemberImpl() {
//		return super.extClassMemberImpl();
		return new EquGenClassMemberExt();
	}
	
	/**
	 * ClassDecl <: ClassMember <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extClassDeclImpl()
	 */
	@Override
	protected Ext extClassDeclImpl() {	// 오버라이딩하고
//		return super.extClassDeclImpl();
		return new EquGenClassDeclExt();
	}
	
	/**
	 * ClassDecl <: ClassMember <: Term <: Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extEnumDeclImpl()
	 */
	@Override
	protected Ext extEnumDeclImpl() {
		return super.extEnumDeclImpl();
	}
	
	/**
	 * FieldDecl <: ClassMember <: Term <: Node	<br>
	 * FieldDecl <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extFieldDeclImpl()
	 */
	@Override
	protected Ext extFieldDeclImpl() {
//		return super.extFieldDeclImpl();
		return new EquGenFieldDeclExt();
	}
	
	/**
	 * CodeDecl <: ClassMember <: Term <: Node	<br>
	 * CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extCodeDeclImpl()
	 */
	@Override
	protected Ext extCodeDeclImpl() {
//		return super.extCodeDeclImpl();
		return new EquGenCodeDeclExt();
	}
	
	/**
	 * ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extProcedureDeclImpl()
	 */
	@Override
	protected Ext extProcedureDeclImpl() {
//		return super.extProcedureDeclImpl();
		return new EquGenProcedureDeclExt();
	}
	
	/**
	 * ConstructorDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * ConstructorDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extConstructorDeclImpl()
	 */
	@Override
	protected Ext extConstructorDeclImpl() {
//		return super.extConstructorDeclImpl();
		return new EquGenConstructorDeclExt();
	}
	
	/**
	 * MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extMethodDeclImpl()
	 */
	@Override
	protected Ext extMethodDeclImpl() {
//		return super.extMethodDeclImpl();
		return new EquGenMethodDeclExt();
	}
	
	/**
	 * AnnotationElemDecl <: MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * AnnotationElemDecl <: MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAnnotationElemDeclImpl()
	 */
	@Override
	protected Ext extAnnotationElemDeclImpl() {
//		return super.extAnnotationElemDeclImpl();
		return new EquGenAnnotationElemDeclExt();
	}
	
	/**
	 * Initializer <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * Initializer <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extInitializerImpl()
	 */
	@Override
	protected Ext extInitializerImpl() {
//		return super.extInitializerImpl();
		return new EquGenInitializerExt();
	}
	
	/**
	 * EnumConstantDecl <: ClassMember <: Term <: Node
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
	
	/**
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extTypeNodeImpl()
	 */
	@Override
	protected Ext extTypeNodeImpl() {
//		return super.extTypeNodeImpl();
		return new EquGenTypeNodeExt();
	}
	
	/**
	 * CanonicalTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * CanonicalTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extCanonicalTypeNodeImpl()
	 */
	@Override
	protected Ext extCanonicalTypeNodeImpl() {
//		return super.extCanonicalTypeNodeImpl();
		return new EquGenCanonicalTypeNodeExt();
	}
	
	/**
	 * ArrayTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * ArrayTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extArrayTypeNodeImpl()
	 */
	@Override
	protected Ext extArrayTypeNodeImpl() {
//		return super.extArrayTypeNodeImpl();
		return new EquGenArrayTypeNodeExt();
	}
	
	/**
	 * AmbTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * AmbTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAmbTypeNodeImpl()
	 */
	@Override
	protected Ext extAmbTypeNodeImpl() {
//		return super.extAmbTypeNodeImpl();
		return new EquGenAmbTypeNodeExt();
	}
	
	/**
	 * ParamTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * ParamTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extParamTypeNodeImpl()
	 */
	@Override
	protected Ext extParamTypeNodeImpl() {
//		return super.extParamTypeNodeImpl();
		return new EquGenParamTypeNodeExt();
	}
	
	/**
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAmbTypeInstantiationImpl()
	 */
	@Override
	protected Ext extAmbTypeInstantiationImpl() {
		// TODO Auto-generated method stub
		return super.extAmbTypeInstantiationImpl();
	}

	/**
	 * @see polyglot.ext.jl5.ast.JL5AbstractExtFactory_c#extAmbWildCardImpl()
	 */
	@Override
	protected Ext extAmbWildCardImpl() {
		// TODO Auto-generated method stub
		return super.extAmbWildCardImpl();
	}
	
	/**
	 * @see polyglot.ext.jl7.ast.JL7AbstractExtFactory_c#extAmbDiamondTypeNodeImpl()
	 */
	@Override
	protected Ext extAmbDiamondTypeNodeImpl() {
		// TODO Auto-generated method stub
		return super.extAmbDiamondTypeNodeImpl();
	}

	/**
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
	
	/**
	 * Stmt <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extStmtImpl()
	 */
	@Override
	protected Ext extStmtImpl() {
//		return super.extStmtImpl();
		return new EquGenStmtExt();
	}
	
	/**
	 * LocalDecl <: ForInit <: Stmt <: Term <: Node	<br>
	 * LocalDecl <: VarDecl <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalDeclImpl()
	 */
	@Override
	protected Ext extLocalDeclImpl() {
//		return super.extLocalDeclImpl();
		return new EquGenLocalDeclExt();
	}
	
	/**
	 * LocalClassDecl <: Stmt <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extLocalClassDeclImpl()
	 */
	@Override
	protected Ext extLocalClassDeclImpl() {
//		return super.extLocalClassDeclImpl();
		return new EquGenLocalClassDeclExt();
	}
	
	/** !Stmt **/
	
	
	/*********
	 * Expr *
	 *********/
	
	/**
	 * Cast <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extCastImpl()
	 */
	@Override
	protected Ext extCastImpl() {
//		return super.extCastImpl();
		return new EquGenCastExt();
	}
	
	/**
	 * Instanceof <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extInstanceofImpl()
	 */
	@Override
	protected Ext extInstanceofImpl() {
//		return super.extInstanceofImpl();
		return new EquGenInstanceofExt();
	}
	
	/**
	 * New <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extNewImpl()
	 */
	@Override
	protected Ext extNewImpl() {
//		return super.extNewImpl();
		return new EquGenNewExt();
	}
	
	/**
	 * NewArray <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extNewArrayImpl()
	 */
	@Override
	protected Ext extNewArrayImpl() {
//		return super.extNewArrayImpl();
		return new EquGenNewArrayExt();
	}
	
	/**
	 * Call <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extCallImpl()
	 */
	@Override
	protected Ext extCallImpl() {
//		return super.extCallImpl();
		return new EquGenCallExt();
	}
	
	/**
	 * Assign <: Expr <: Term <: Node
	 * @see polyglot.ast.AbstractExtFactory_c#extAssignImpl()
	 */
	@Override
	protected Ext extAssignImpl() {
//		return super.extAssignImpl();
		return new EquGenAssignExt();
	}
	
	/** !Expr **/
}