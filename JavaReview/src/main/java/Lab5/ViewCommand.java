package Lab5;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Paths;

public class ViewCommand implements CustomCommands
{
	private FileService fileService;
	private final String DEFAULT_FILE_PATH = "src/main/java/Lab5/master/Alex 23/Example.txt";
	
	public ViewCommand(FileService fileService) 
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
		System.out.print("opens: opens a document using\n");
	}

	@Override
	public void run() 
	{
		Desktop desktoInstance = Desktop.getDesktop();
		try 
		{
			desktoInstance.edit(Paths.get(this.DEFAULT_FILE_PATH).toFile());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public String toString() 
	{
		return "ViewCommand [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
