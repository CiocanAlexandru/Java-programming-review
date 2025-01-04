package Lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Statue extends Atraction implements Visitable
{
	private Map<LocalDate, TimeInterval> timeTable = new HashMap<>();
	private String name;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setTimeTable(Map<LocalDate, TimeInterval> timeTable) 
	{
		this.timeTable = timeTable;
	}

	@Override
	public Map<LocalDate, TimeInterval> getTimeTable() 
	{
		return this.timeTable;
	}

	@Override
	public String toString() {
		return "Statue [timeTable=" + timeTable + ", name=" + name + "]";
	}	
}
