package Lab5;

public class ReportCommand implements CustomCommands
{
	private FileService fileService;
	
	public ReportCommand(FileService fileService) 
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
		System.out.print("report: creates (and a HTML report representing the content of the repository\n");
	}

	@Override
	public void run() 
	{
		
	}

	@Override
	public String toString() 
	{
		return "ReportCommand [fileService=" + fileService + "]";
	}	
}
