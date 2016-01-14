package tool.compiler.java;

/**
 * Main is the main program of the compiler extension. It simply invokes
 * Polyglot's main, passing in the extension's ExtensionInfo.
 */
public class Main {
	public static void main(String[] args) {
		// For Java 7
		// polyglotMain.start(args, new polyglot.ext.jl7.JL7ExtensionInfo());
		
		// For Java 7 plus an extra compilation pass
		polyglot.main.Main polyglotMain = new polyglot.main.Main();
		
		try {
			polyglotMain.start(args, new tool.compiler.java.ExtensionInfo());
		} catch (polyglot.main.Main.TerminationException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}