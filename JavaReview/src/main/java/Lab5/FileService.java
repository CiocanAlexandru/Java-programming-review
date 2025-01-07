package Lab5;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileService 
{	
	private Map<Person ,List<Path>> dataFiles = new HashMap<>();
	
	public Map<Person, List<Path>> getDataFiles() 
	{
		return dataFiles;
	}

	public void setDataFiles(Map<Person, List<Path>> dataFiles) 
	{
		this.dataFiles = dataFiles;
	}
	
	void getDataFromPath(Path path)
	{
		//logic to get the data for each person and list of files he has
		try 
		{
			Files.walkFileTree(path, new FileVisitor<Path>() {
				
				public Person personDirectory;
				
				public boolean checkDirectoryName(String directoryName)
				{
					
					String regex = "^[A-Za-z]+ \\d+$";
					Pattern pattern = Pattern.compile(regex);
			        Matcher matcher = pattern.matcher(directoryName.toString());
			        
					return matcher.matches();
				}
				
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException 
				{
					System.out.print("PreDir: "+ dir + ": "+ dir.getFileName()+"\n");
					
					if (this.checkDirectoryName(dir.getFileName().toString()))
					{
						String[] parts = dir.getFileName().toString().split(" ");
	                    String name = parts[0];
	                    int id = Integer.parseInt(parts[1]);

	    
	                    Person personFound = new Person(name, id);
						if (!dataFiles.containsKey(personFound))
						{
							dataFiles.put(personFound,new ArrayList<>());
							this.personDirectory = personFound;
						}
						
					}
					
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException 
				{
					
					System.out.print("FileVisited: " + file + "\n");
					dataFiles.get(this.personDirectory).add(file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException 
				{
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException 
				{
					System.out.print("PostDir:" + dir + "\n");
					return FileVisitResult.CONTINUE;
				}
				
			});
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() 
	{
		return "FileService [dataFiles=" + dataFiles + "]";
	}
}
