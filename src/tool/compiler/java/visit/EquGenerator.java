package tool.compiler.java.visit;

import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ext.jl5.types.*;
import polyglot.frontend.Job;
import polyglot.main.Report;
import polyglot.types.*;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import tool.compiler.java.ast.EquGenLang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class EquGenerator extends ContextVisitor {
	
	/* Environments */
	private static HashMap<JL5ClassType, Boolean> classEnv;
	private static HashMap<JL5ProcedureInstance, Boolean> methodEnv;
	private static HashMap<JL5FieldInstance, Boolean> fieldEnv;
	private static HashMap<JL5ProcedureInstance, HashMap<JL5LocalInstance, Boolean>> localEnv;
	
	/* Used */
	private static HashSet<JL5ClassType> usedclasses;
	private static HashSet<JL5ProcedureInstance> usedMethods;
	private static HashSet<JL5FieldInstance> usedFields;
	private static HashMap<JL5ProcedureInstance, HashSet<JL5LocalInstance>> usedLocals;
	
	private static JL5ProcedureInstance currentMethodEnv;
	
	
	private static final boolean defaultUse = false;
	
	
	public EquGenerator(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
	}
	
	@Override
	public EquGenLang lang() {
		return (EquGenLang) super.lang();
	}
	
	@Override
	public NodeVisitor begin() {
		Report.report(1, "EquGenerator: begin()");
		NodeVisitor nv = super.begin();
		
		classEnv = new HashMap<>();
		methodEnv = new HashMap<>();
		fieldEnv = new HashMap<>();
		localEnv = new HashMap<>();
		
		usedclasses = new HashSet<>();
		usedMethods = new HashSet<>();
		usedFields = new HashSet<>();
		usedLocals = new HashMap<>();
		
		return nv;
	}
	
	@Override
	public void finish() {
		Report.report(1, "EquGenerator: finish()");
		
		checkClassEnv();
		checkMethodEnv();
		checkFieldEnv();
		checkLocalEnv();
		
		Report.report(1, "Class Env (" + classEnv.size()+"):\t\t" + classEnv);
		Report.report(1, "Method Env (" + methodEnv.size()+"):\t\t" + methodEnv);
		Report.report(1, "Field Env (" + fieldEnv.size()+"):\t\t" + fieldEnv);
		Report.report(1, "Local Env (" + localEnv.size() + "):\t\t" + localEnv);
		
		super.finish();
	}
	
//	@Override
//	protected NodeVisitor enterCall(Node parent, Node n)
//			throws SemanticException {
//
////		reportPackage(n);
//		
//		return super.enterCall(parent, n);
//	}
	
	@Override
	protected NodeVisitor enterCall(Node n)
			throws SemanticException {
		
		return lang().equGenEnter(n, this);	// 추가한 메소드 호출 
	}
	
//	@Override
//	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
//			throws SemanticException {
//
//		return super.leaveCall(parent, old, n, v);
//	}
	
	@Override
	protected Node leaveCall(Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
		return lang().equGen(n,  this);	// 추가한 메소드 호출
	}
	
//	@Override
//	protected Node leaveCall(Node n) throws SemanticException {
//
//		return super.leaveCall(n);
//	}
	
	@Override
	public TypeSystem typeSystem() {
		return super.typeSystem();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	/**
	 * 환경 추가 메서드
	 */
	
	public void addToImportEnv() {
		
	}
	
	public void addToClassEnv(JL5ClassType classType) {
		if(classType.flags().isPrivate()) {
			classEnv.put(classType, defaultUse);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void addToMethodEnv(JL5ProcedureInstance methodIns) {
		if(methodIns.flags().isPrivate()) {
			methodEnv.put(methodIns, defaultUse);
//			setCurrentMethodEnv(methodIns);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void addToFieldEnv(JL5FieldInstance fieldIns) {
		if(fieldIns.flags().isPrivate()) {
			fieldEnv.put(fieldIns, defaultUse);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void addToLocalEnv(JL5LocalInstance localIns) {
		// localIns은 가시성을 검사하지 않음.
		try {
			if(!localEnv.containsKey(currentMethodEnv)) {
				localEnv.put(currentMethodEnv, new HashMap<>());
			}
			localEnv.get(currentMethodEnv).put(localIns, defaultUse);
		} catch (NullPointerException e) {
			if(currentMethodEnv == null) {
				throw new CurrentMethodEnvNotSetException();
			} else {
				throw e;
			}
		}
	}
	
	public void setCurrentMethodEnv(JL5ProcedureInstance methodIns) {
		currentMethodEnv = methodIns;
	}
	
	public JL5ProcedureInstance getCurrentMethodEnv() {
		return currentMethodEnv;
	}
	
	/**
	 * 사용 여부 표시 메서드
	 */
	
	public void markOnImportEnv() {
		
	}
	
	public void markOnClassEnv(JL5ClassType classType) {
		if(classType.flags().isPrivate()) {
			usedclasses.add(classType);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void markOnMethodEnv(JL5ProcedureInstance methodIns) {
		if(methodIns.flags().isPrivate()) {
			usedMethods.add(methodIns);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void markOnFieldEnv(JL5FieldInstance fieldIns) {
		if(fieldIns.flags().isPrivate()) {
			usedFields.add(fieldIns);
		} else {	// TODO: private이 아닌 경우에 대한 처리
//			throw new NotPrivateException();
		}
	}
	
	public void markOnLocalEnv(JL5LocalInstance localIns) {
		// localIns은 가시성을 검사하지 않음.
		try {
			if(!usedLocals.containsKey(currentMethodEnv)) {
				usedLocals.put(currentMethodEnv, new HashSet<>());
			}
			usedLocals.get(currentMethodEnv).add(localIns);
		} catch (NullPointerException e) {
			if(currentMethodEnv == null) {
				throw new CurrentMethodEnvNotSetException();
			} else {
				throw e;
			}
		}
	}
	
	/**
	 * 환경 검사 메서드
	 */
	
	public void checkImportEnv() {
		
	}
	
	public void checkClassEnv() {
		checkEnv(classEnv, usedclasses);
	}
	
	public void checkMethodEnv() {
		checkEnv(methodEnv, usedMethods);
	}
	
	public void checkFieldEnv() {
		checkEnv(fieldEnv, usedFields);
	}
	
	public void checkLocalEnv() {
		for(Entry<JL5ProcedureInstance, HashMap<JL5LocalInstance, Boolean>> currPdLocalEnv: localEnv.entrySet()) {
			try {
				checkEnv(localEnv.get(currPdLocalEnv.getKey()), usedLocals.get(currPdLocalEnv.getKey()));
			} catch (NullPointerException ignored) {}		// null인 경우 무시 (검사하지 않음).
		}
	}
	
	private void checkEnv(HashMap<?, Boolean> env, HashSet<?> usedEnv) {
		for(Entry<?, Boolean> curEnv: env.entrySet()) {
			for(Object used: usedEnv) {
				if(used.equals(curEnv.getKey())) {
					curEnv.setValue(true);
					break;
				}
			}
		}
	}
	
	public class CurrentMethodEnvNotSetException extends NullPointerException {
		private static final long serialVersionUID = 7692345744334669010L;
	}
	
	public class NotPrivateException extends Exception {
		private static final long serialVersionUID = -94432147478225830L;
	}
}