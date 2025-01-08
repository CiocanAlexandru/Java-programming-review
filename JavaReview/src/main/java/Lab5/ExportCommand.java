package Lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ExportCommand implements CustomCommands 
{
	private FileService fileService;
	private final String JSON_PATH = "src/main/java/Lab5/master/Export/export.json";
	
	public ExportCommand(FileService fileService) 
	{
		super();
		this.fileService = fileService;
	}
	
	public FileService getFileService() 
	{
		return fileService;
	}

	public void setFileService(FileService fileService) 
	{
		this.fileService = fileService;
	}

	@Override
	public void help() 
	{
		System.out.print("export: exports the repository to an external file using JSON format\n");
	}

	@Override
	public void run() 
	{
		ObjectMapper objMapper = new ObjectMapper();
		Path jsonPath = Paths.get(this.JSON_PATH);
		
		if (!Files.exists(jsonPath)) 
		{
			System.out.println("Fișierul nu există. Se va crea unul nou.");
			
			try 
			{
			 	Files.createDirectories(jsonPath.getParent());
		          
	            Files.createFile(jsonPath);
	            System.out.println("Fișier creat: " + jsonPath);
			} 
			catch (IOException e) 
			{
				System.err.println("Eroare la crearea fișierului: " + e.getMessage());
				        e.printStackTrace();
			}
		} 
		
	    try 
	    {
			objMapper.writerWithDefaultPrettyPrinter().writeValue(jsonPath.toFile(),this.fileService.getDataFiles());
		} 
	    catch (JsonProcessingException e) 
	    {
			e.printStackTrace();
		} 
	    catch (IOException e) 
	    {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public String toString() 
	{
		return "ExportCommand [fileService=" + fileService + "]";
	}	
}
