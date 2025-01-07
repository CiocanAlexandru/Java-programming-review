package Lab5;

import java.nio.file.Paths;

public class Lab5 {
	
	 private static final String FILE_PATH = "src/main/java/Lab5/master";

	    public void problemsSolved() 
	    {

	    	FileService fileService = new FileService();
	    	fileService.getDataFromPath(Paths.get(FILE_PATH));
	    	CustomCommands exportCommand =  new ExportCommand(fileService); 
	    	CustomCommands reportCommand = new ReportCommand(fileService);
	    	CustomCommands viewCommand = new ViewCommand(fileService); 
	    	
	    	System.out.print("Comand info:\n");
	    	exportCommand.help();
	    	reportCommand.help();
	    	viewCommand.help();
	    	
	    }
}
