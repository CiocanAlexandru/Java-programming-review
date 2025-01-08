package Lab5;

import java.nio.file.Paths;
import java.util.Scanner;

public class Lab5 {
	
 	private static final String FILE_PATH = "src/main/java/Lab5/master";

    public void problemsSolved() 
    {

    	FileService fileService = new FileService();
    	fileService.getDataFromPath(Paths.get(FILE_PATH));
    	CustomCommands exportCommand =  new ExportCommand(fileService); 
    	CustomCommands reportCommand = new ReportCommand(fileService); 
    	CustomCommands viewCommand = new ViewCommand(fileService); 
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	 while (true) 
    	 {
             System.out.print("Give me the command (export, view, help, exit): ");
             String commandInput = scanner.nextLine().trim();

             switch (commandInput.toLowerCase()) 
             {
                 case "export":
                     exportCommand.run();
                     break;
                 case "view":
                     viewCommand.run();
                     break;
                 case "report":
                	 reportCommand.run();
                	 break;
                 case "help":
                     System.out.println("Available commands:");
                     exportCommand.help();
                     viewCommand.help();
                     reportCommand.help();
                     break;
                 case "exit":
                     System.out.println("Exiting...");
                     scanner.close();
                     return;
                 default:
                     System.out.println("Unknown command. Type 'help' for a list of commands.");
             }
        }
    }
}
