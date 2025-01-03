package Lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Statue extends Atraction implements Visitable
{

	private Map<LocalDate, TimeInterval> timeTable = new HashMap<>();
	
	public void setTimeTable(Map<LocalDate, TimeInterval> timeTable) {
		this.timeTable = timeTable;
	}

	@Override
	public Map<LocalDate, TimeInterval> getTimetable() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() 
	{
		return "Statue [timeInterval=" + timeTable + "]";
	}
    
}
