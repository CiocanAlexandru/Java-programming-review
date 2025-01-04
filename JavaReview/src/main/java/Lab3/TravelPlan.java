package Lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelPlan {

	private Map<LocalDate,List<Atraction>> travelPlan = new HashMap<>();

	public Map<LocalDate, List<Atraction>> getTravelPlan() 
	{
		return travelPlan;
	}

	public void setTravelPlan(Map<LocalDate, List<Atraction>> travelPlan) 
	{
		this.travelPlan = travelPlan;
	}
   
	public void addAttrcation(LocalDate localDate, Atraction atraction)
	{
		if (this.travelPlan.get(localDate) == null) 
		{
            
            this.travelPlan.put(localDate, new ArrayList<>());
        }
        
        this.travelPlan.get(localDate).add(atraction);
	}
	@Override
	public String toString() {
		return "TravelPlan [travelPlan=" + travelPlan + "]";
	}
}
