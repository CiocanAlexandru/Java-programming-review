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
		if (this.getTimeTable() == null || !this.getTimeTable().containsKey(Date)) 
		{
            return LocalTime.of(0, 0);
        }
		return this.getTimeTable().get(Date).getFirst();
	}
}
