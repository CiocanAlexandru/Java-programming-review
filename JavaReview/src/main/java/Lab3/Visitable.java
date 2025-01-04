package Lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public interface Visitable 
{
	Map<LocalDate, TimeInterval> getTimeTable();
	
	default LocalTime openingDate(LocalDate Date)
	{
		return this.getTimeTable().get(Date).getFirst();
	}
}
