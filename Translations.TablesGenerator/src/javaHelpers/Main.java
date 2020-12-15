package javaHelpers;

import java.util.HashMap;
import org.eclipse.emf.mwe.core.WorkflowEngine;

public class Main {

	/**
	 * The main method which is called when the program is started.
	 * @param args: Command-line arguments.
	 */
	public static void main(String[] args) {
		if(args.length >= 3) {
			HashMap<String, String> properties = new HashMap<String, String>();
			properties.put("modelFileEn", args[0]);
			properties.put("modelFileBg", args[1]);
			properties.put("outputPath", args[2]);
			
			runWorkflow(properties);
		}
		else {
			System.out.println("Application usage: java -jar <NameOfExecutable>.jar <EnglishLanguageInputXmlFilePath> <BulgarianLanguageInputXmlFilePath>");
		}
	}
	
	/**
	 * Runs the workflow file which processes the code generation.
	 * @param properties: The workflow properties.
	 */
	public static void runWorkflow(HashMap<String, String> properties) {
		WorkflowEngine runner = new WorkflowEngine();
		
		String workFlowFile =  "./workflows/Generate.mwe";
		try {
			runner.run(workFlowFile, null, properties, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
