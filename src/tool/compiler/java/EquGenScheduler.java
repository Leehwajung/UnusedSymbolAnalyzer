package tool.compiler.java;

import polyglot.ast.NodeFactory;
import polyglot.frontend.CyclicDependencyException;
import polyglot.frontend.ExtensionInfo;
import polyglot.ext.jl7.JL7ExtensionInfo;
import polyglot.ext.jl7.JL7Scheduler;
import polyglot.frontend.Job;
import polyglot.frontend.goals.Goal;
import polyglot.frontend.goals.VisitorGoal;
import polyglot.types.TypeSystem;
import polyglot.util.InternalCompilerError;
import tool.compiler.java.visit.EquGenerator;

public class EquGenScheduler extends JL7Scheduler {

	public EquGenScheduler(JL7ExtensionInfo extInfo) {
		super(extInfo);
	}

	public Goal EquGenerated(Job job) {
		ExtensionInfo extInfo = job.extensionInfo();
		TypeSystem ts = extInfo.typeSystem();
		NodeFactory nf = extInfo.nodeFactory();
		Goal g = new VisitorGoal(job, new EquGenerator(job, ts, nf));
		try {
			g.addPrerequisiteGoal(TypeChecked(job), this);
		} catch (CyclicDependencyException e) {
			throw new InternalCompilerError(e);
		}
		return internGoal(g);
	}

	// Add a pass before ReachabilityChecked (after TypeChecked)
	@Override
	public Goal ReachabilityChecked(Job job) {
		Goal goal = super.ReachabilityChecked(job);
		try {
			goal.addPrerequisiteGoal(EquGenerated(job), this);
		} catch (CyclicDependencyException e) {
			throw new InternalCompilerError(e);
		}
		return internGoal(goal);
	}
}