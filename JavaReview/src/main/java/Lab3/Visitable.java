package Lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public interface Visitable 
{
	Map<LocalDate, TimeInterval> getTimetable();
	
	default LocalTime openingDate(LocalDate Date)
	{
		LocalTime time = LocalTime.of(14, 30);
		return time;
	}
}
