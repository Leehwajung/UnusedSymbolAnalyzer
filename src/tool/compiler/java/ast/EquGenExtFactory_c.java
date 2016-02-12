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
	
	/**
	 * Node
	 */
	@Override
	protected Ext extNodeImpl() {
		return new EquGenExt();
	}
	
	// TODO: Override factory methods for new extension nodes in the current
	// extension.
	
	/**
	 * Node
	 */
	@Override
	protected Ext extNodeListImpl() {
//		return super.extNodeListImpl();
		return new EquGenNodeListExt();
	}
	
	/**
	 * Id <: Node
	 */
	@Override
	protected Ext extIdImpl() {
//		return super.extIdImpl();
		return new EquGenIdExt();
	}
	
	/**
	 * SourceFile <: Node
	 */
	@Override
	protected Ext extSourceFileImpl() {
//		return super.extSourceFileImpl();
		return new EquGenSourceFileExt();
	}
	
	/**
	 * SourceCollection <: Node
	 */
	@Override
	protected Ext extSourceCollectionImpl() {
//		return super.extSourceCollectionImpl();
		return new EquGenSourceCollectionExt();
	}
	
	/**
	 * Import <: Node
	 */
	@Override
	protected Ext extImportImpl() {
//		return super.extImportImpl();
		return new EquGenImportExt();
	}
	
	/**
	 * PackageNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extPackageNodeImpl() {
//		return super.extPackageNodeImpl();
		return new EquGenPackageNodeExt();
	}
	
	/**
	 * AmbPrefix <: Prefix <: Node	<br>
	 * AmbPrefix <: Ambiguous <: Node
	 */
	@Override
	protected Ext extAmbPrefixImpl() {
//		return super.extAmbPrefixImpl();
		return new EquGenAmbPrefixExt();
	}
	
	/**
	 * AmbReceiver <: Receiver <: Prefix <: Node	<br>
	 * AmbReceiver <: Ambiguous <: Node
	 */
	@Override
	protected Ext extAmbReceiverImpl() {
//		return super.extAmbReceiverImpl();
		return new EquGenAmbReceiverExt();
	}
	
	/**
	 * AmbQualifierNode <: QualifierNode <: Prefix <: Node	<br>
	 * AmbQualifierNode <: Ambiguous <: Node
	 */
	@Override
	protected Ext extAmbQualifierNodeImpl() {
//		return super.extAmbQualifierNodeImpl();
		return new EquGenAmbQualifierNodeExt();
	}
	
	/**
	 * Term <: Node
	 */
	@Override
	protected Ext extTermImpl() {
//		return super.extTermImpl();
		return new EquGenTermExt();
	}

	/**
	 * ClassBody <: Term <: Node
	 */
	@Override
	protected Ext extClassBodyImpl() {
//		return super.extClassBodyImpl();
		return new EquGenClassBodyExt();
	}
	
	/**
	 * ElementValueArrayInit <: Term <: Node
	 */
	@Override
	protected Ext extElementValueArrayInitImpl() {
//		return super.extElementValueArrayInitImpl();
		return new EquGenElementValueArrayInitExt();
	}

	/**
	 * ElementValuePair <: Term <: Node
	 */
	@Override
	protected Ext extElementValuePairImpl() {
//		return super.extElementValuePairImpl();
		return new EquGenElementValuePairExt();
	}
	
	/**
	 * Formal <: VarDecl <: Term <: Node
	 */
	@Override
	protected Ext extFormalImpl() {
//		return super.extFormalImpl();
		return new EquGenFormalExt();
	}
	
	/**
	 * Term <: Node
	 */
	@Override
	protected Ext extNormalAnnotationElemImpl() {
//		return super.extNormalAnnotationElemImpl();
		return new EquGenNormalAnnotationElemExt();
	}
	
	/**
	 * Term <: Node
	 */
	@Override
	protected Ext extMarkerAnnotationElemImpl() {
//		return super.extMarkerAnnotationElemImpl();
		return new EquGenMarkerAnnotationElemExt();
	}
	
	/**
	 * Term <: Node
	 */
	@Override
	protected Ext extSingleElementAnnotationElemImpl() {
//		return super.extSingleElementAnnotationElemImpl();
		return new EquGenSingleElementAnnotationElemExt();
	}
	
	/******************
	 * ClassMember *
	 ******************/
	
	/**
	 * ClassMember <: Term <: Node
	 */
	@Override
	protected Ext extClassMemberImpl() {
//		return super.extClassMemberImpl();
		return new EquGenClassMemberExt();
	}
	
	/**
	 * ClassDecl <: ClassMember <: Term <: Node
	 */
	@Override
	protected Ext extClassDeclImpl() {	// 오버라이딩하고
//		return super.extClassDeclImpl();
		return new EquGenClassDeclExt();
	}
	
	/**
	 * ClassDecl <: ClassMember <: Term <: Node
	 */
	@Override
	protected Ext extEnumDeclImpl() {
//		return super.extEnumDeclImpl();
		return new EquGenEnumDeclExt();
	}
	
	/**
	 * FieldDecl <: ClassMember <: Term <: Node	<br>
	 * FieldDecl <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extFieldDeclImpl() {
//		return super.extFieldDeclImpl();
		return new EquGenFieldDeclExt();
	}
	
	/**
	 * CodeDecl <: ClassMember <: Term <: Node	<br>
	 * CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extCodeDeclImpl() {
//		return super.extCodeDeclImpl();
		return new EquGenCodeDeclExt();
	}
	
	/**
	 * ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extProcedureDeclImpl() {
//		return super.extProcedureDeclImpl();
		return new EquGenProcedureDeclExt();
	}
	
	/**
	 * ConstructorDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * ConstructorDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extConstructorDeclImpl() {
//		return super.extConstructorDeclImpl();
		return new EquGenConstructorDeclExt();
	}
	
	/**
	 * MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extMethodDeclImpl() {
//		return super.extMethodDeclImpl();
		return new EquGenMethodDeclExt();
	}
	
	/**
	 * AnnotationElemDecl <: MethodDecl <: ProcedureDecl <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * AnnotationElemDecl <: MethodDecl <: ProcedureDecl <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extAnnotationElemDeclImpl() {
//		return super.extAnnotationElemDeclImpl();
		return new EquGenAnnotationElemDeclExt();
	}
	
	/**
	 * Initializer <: CodeDecl <: ClassMember <: Term <: Node	<br>
	 * Initializer <: CodeDecl <: CodeBlock <: CodeNode <: Term <: Node
	 */
	@Override
	protected Ext extInitializerImpl() {
//		return super.extInitializerImpl();
		return new EquGenInitializerExt();
	}
	
	/**
	 * EnumConstantDecl <: ClassMember <: Term <: Node
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
	 * TypeNode <: Term <: Node	<br>
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extTypeNodeImpl() {
//		return super.extTypeNodeImpl();
		return new EquGenTypeNodeExt();
	}
	
	/**
	 * CanonicalTypeNode <: TypeNode <: Term <: Node	<br>
	 * CanonicalTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * CanonicalTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extCanonicalTypeNodeImpl() {
//		return super.extCanonicalTypeNodeImpl();
		return new EquGenCanonicalTypeNodeExt();
	}
	
	/**
	 * ArrayTypeNode <: TypeNode <: Term <: Node	<br>
	 * ArrayTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * ArrayTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 * ArrayTypeNode <: Ambiguous <: Node
	 */
	@Override
	protected Ext extArrayTypeNodeImpl() {
//		return super.extArrayTypeNodeImpl();
		return new EquGenArrayTypeNodeExt();
	}
	
	/**
	 * AmbTypeNode <: TypeNode <: Term <: Node	<br>
	 * AmbTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * AmbTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node	<br>
	 * AmbTypeNode <: AmbQualifierNode <: QualifierNode <: Prefix <: Node	<br>
	 * AmbTypeNode <: AmbQualifierNode <: Ambiguous <: Node
	 */
	@Override
	protected Ext extAmbTypeNodeImpl() {
//		return super.extAmbTypeNodeImpl();
		return new EquGenAmbTypeNodeExt();
	}
	
	/**
	 * ParamTypeNode <: TypeNode <: Term <: Node	<br>
	 * ParamTypeNode <: TypeNode <: Receiver <: Prefix <: Node	<br>
	 * ParamTypeNode <: TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extParamTypeNodeImpl() {
//		return super.extParamTypeNodeImpl();
		return new EquGenParamTypeNodeExt();
	}
	
	/**
	 * TypeNode <: Term <: Node	<br>
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extAmbTypeInstantiationImpl() {
//		return super.extAmbTypeInstantiationImpl();
		return new EquGenAmbTypeInstantiationExt();
	}

	/**
	 * TypeNode <: Term <: Node	<br>
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extAmbWildCardImpl() {
//		return super.extAmbWildCardImpl();
		return new EquGenAmbWildCardExt();
	}
	
	/**
	 * TypeNode <: Term <: Node	<br>
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extAmbDiamondTypeNodeImpl() {
//		return super.extAmbDiamondTypeNodeImpl();
		return new EquGenAmbDiamondTypeNodeExt();
	}

	/**
	 * TypeNode <: Term <: Node	<br>
	 * TypeNode <: Receiver <: Prefix <: Node	<br>
	 * TypeNode <: QualifierNode <: Prefix <: Node
	 */
	@Override
	protected Ext extAmbUnionTypeImpl() {
//		return super.extAmbUnionTypeImpl();
		return new EquGenAmbUnionTypeExt();
	}
	
	/** !TypeNode **/
	
	
	/*********
	 * Expr *
	 *********/
	
	/**
	 * Expr <: Term <: Node	<br>
	 * Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extExprImpl() {
//		return super.extExprImpl();
		return new EquGenExprExt();
	}
	
	/**
	 * Assign <: Expr <: Term <: Node	<br>
	 * Assign <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extAssignImpl() {
//		return super.extAssignImpl();
		return new EquGenAssignExt();
	}
	
	/**
	 * Call <: Expr <: Term <: Node	<br>
	 * Call <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extCallImpl() {
//		return super.extCallImpl();
		return new EquGenCallExt();
	}
	
	/**
	 * New <: Expr <: Term <: Node	<br>
	 * New <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extNewImpl() {
//		return super.extNewImpl();
		return new EquGenNewExt();
	}
	
	/**
	 * NewArray <: Expr <: Term <: Node	<br>
	 * NewArray <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extNewArrayImpl() {
//		return super.extNewArrayImpl();
		return new EquGenNewArrayExt();
	}
	
	/**
	 * Cast <: Expr <: Term <: Node	<br>
	 * Cast <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extCastImpl() {
//		return super.extCastImpl();
		return new EquGenCastExt();
	}
	
	/**
	 * Instanceof <: Expr <: Term <: Node	<br>
	 * Instanceof <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extInstanceofImpl() {
//		return super.extInstanceofImpl();
		return new EquGenInstanceofExt();
	}
	
	/**
	 * Field <: NamedVariable <: Variable <: Expr <: Term <: Node
	 * Field <: NamedVariable <: Variable <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extFieldImpl() {
//		return super.extFieldImpl();
		return new EquGenFieldExt();
	}

	/**
	 * Local <: NamedVariable <: Variable <: Expr <: Term <: Node
	 * Local <: NamedVariable <: Variable <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extLocalImpl() {
//		return super.extLocalImpl();
		return new EquGenLocalExt();
	}
	
	/**
	 * ClassLit <: Lit <: Expr <: Term <: Node	<br>
	 * ClassLit <: Lit <: Expr <: Receiver <: Prefix <: Node
	 */
	@Override
	protected Ext extClassLitImpl() {
//		return super.extClassLitImpl();
		return new EquGenClassLitExt();
	}
	
	/** !Expr **/
	
	
	/*********
	 * Stmt *
	 *********/
	
	/**
	 * Stmt <: Term <: Node	<br>
	 */
	@Override
	protected Ext extStmtImpl() {
//		return super.extStmtImpl();
		return new EquGenStmtExt();
	}
	
	/**
	 * LocalDecl <: ForInit <: Stmt <: Term <: Node	<br>
	 * LocalDecl <: VarDecl <: Term <: Node
	 */
	@Override
	protected Ext extLocalDeclImpl() {
//		return super.extLocalDeclImpl();
		return new EquGenLocalDeclExt();
	}
	
	/**
	 * LocalClassDecl <: Stmt <: Term <: Node
	 */
	@Override
	protected Ext extLocalClassDeclImpl() {
//		return super.extLocalClassDeclImpl();
		return new EquGenLocalClassDeclExt();
	}
	
	/** !Stmt **/
}