package Lab5;

public class ExportCommand implements CustomCommands 
{
	private FileService fileService;
	
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
		
	}

	@Override
	public String toString() 
	{
		return "ExportCommand [fileService=" + fileService + "]";
	}	
}
