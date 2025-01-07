package Lab5;

public class ViewCommand implements CustomCommands
{
	private FileService fileService;
	
	public ViewCommand(FileService fileService) 
	{
		super();
		this.fileService = fileService;
	}

	public FileService getFileService() 
	{
		return fileService;
	}

	public void setFileService(FileService fileService) {
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
		
	}

	@Override
	public String toString() 
	{
		return "ViewCommand [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
