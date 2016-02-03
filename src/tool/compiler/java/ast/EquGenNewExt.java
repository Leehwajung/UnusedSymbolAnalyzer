package tool.compiler.java.ast;

import java.util.Map.Entry;

import polyglot.ast.New;
import polyglot.ast.Node;
import polyglot.ext.jl5.types.JL5ClassType;
import polyglot.ext.jl5.types.JL5ParsedClassType;
import polyglot.ext.jl5.types.JL5SubstClassType;
import polyglot.ext.jl5.types.TypeVariable;
import polyglot.main.Report;
import polyglot.types.ReferenceType;
import polyglot.types.Type;
import polyglot.util.SerialVersionUID;
import tool.compiler.java.visit.EquGenerator;

/**
 * New <: Expr <: Term <: Node
 * New <: Expr <: Receiver <: Prefix <: Node
 * @author LHJ
 */
public class EquGenNewExt extends EquGenExprExt {
	private static final long serialVersionUID = SerialVersionUID.generate();

	@Override
	public EquGenerator equGenEnter(EquGenerator v) {
		New nw = (New) this.node();
		Report.report(0, "New: " + nw);
		
		Type type = nw.type();
		/* Class 사용: Type of new object */
		v.markOnClassEnv((JL5ClassType)type);
		
		/* Class 사용: Super class of Anonymous Subclass */
		if(type instanceof JL5ParsedClassType) {
			if(((JL5ParsedClassType)type).pclass() == null) {
				// new 할 때 자식 클래스 정의하므로 이름이 없어 Parsed Class가 없음(null).
				Type superType = ((JL5ClassType) type).superType();
				
				/* Class 사용: Super class as substitution type of anonymous subclass */
				if (superType instanceof JL5SubstClassType) {	// JL5SubstClassType 객체가 아닌 경우를 걸러냄.
					v.markOnClassEnv(((JL5SubstClassType) superType).base());	// Base
					for(Entry<TypeVariable, ReferenceType> substType
							: ((JL5SubstClassType) superType).subst().substitutions().entrySet()) {
						v.markOnClassEnv((JL5ClassType) substType.getValue());	// Substitutions
					}
				}
				
				/* Class 사용: Super class type of anonymous subclass */
				else {
					v.markOnClassEnv((JL5ClassType) superType);
				}
			}
		}
		
		return super.equGenEnter(v);
	}

	@Override
	public Node equGen(EquGenerator v) {
		return super.equGen(v);
	}
}