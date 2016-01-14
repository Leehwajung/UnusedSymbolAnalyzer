package tool.compiler.java;

import java.io.File;
import java.util.ArrayList;

/**
 * Main is the main program of the compiler extension. It simply invokes
 * Polyglot's main, passing in the extension's ExtensionInfo.
 */
public class Main {
	
	public static void main(String[] args) {
		polyglot.main.Main polyglotMain = new polyglot.main.Main();
		
		ArrayList<String> filePathList = new ArrayList<>();
		for (String arg : args) {
			filePathList.addAll(getAllSubCompilableFilePaths(new File(arg)));
		}
		System.out.println(filePathList);
		
		try {
			// For Java 7
			// polyglotMain.start(args, new
			// polyglot.ext.jl7.JL7ExtensionInfo());
			
			// For Java 7 plus an extra compilation pass
			polyglotMain.start(/*args*/filePathList.toArray(new String[filePathList.size()]), new tool.compiler.java.ExtensionInfo());
		} catch (polyglot.main.Main.TerminationException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
	
	private static ArrayList<String> getAllSubCompilableFilePaths(File file) {
		
		File[] packedFile = new File[1];
		packedFile[0] = file;
		ArrayList<File> fileList = getSubFile(packedFile, new ArrayList<File>());
		
		ArrayList<String> result = new ArrayList<>();
		for(File subFile : fileList) {
			String fileName = subFile.getName().toLowerCase();
			if(fileName.endsWith(".java")/* || fileName.endsWith(".jl") || fileName.endsWith(".jl5") || fileName.endsWith(".jl7")*/) {
				result.add(subFile.getPath());
			}
		}
		
		return result;
	}
	
	private static ArrayList<File> getSubFile(File[] files, ArrayList<File> fileList) {
		
		for(File file : files) {
			if(file.isDirectory()) {
				getSubFile(file.listFiles(), fileList);
			} else if (file.isFile()) {
				fileList.add(file);
			}
		}
		
		return fileList;
	}
}