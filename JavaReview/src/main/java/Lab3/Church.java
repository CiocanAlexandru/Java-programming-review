package Lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Church extends Location implements Visitable
{
	private Map<LocalDate, TimeInterval> timeTable = new HashMap<>();
	
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
	public String toString() 
	{
		return "Church [timeTable=" + timeTable + "]";
	}

}
