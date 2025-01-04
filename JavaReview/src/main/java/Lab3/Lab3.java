package Lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab3 
{
	
	private Map<LocalDate, TimeInterval> createRandomTimeTable() {
        Map<LocalDate, TimeInterval> timeTable = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            LocalDate date = LocalDate.of(2025, 1, 4).plusDays(i);
            LocalTime start = LocalTime.of((int) (Math.random() * 12) + 8, (int) (Math.random() * 60));  
            LocalTime end = start.plusHours(2 + (int) (Math.random() * 4));

            timeTable.put(date, new TimeInterval(start, end));
        }
        
        return timeTable;
    }
    
	public void problemsSolved()
	{	
		//create instances of church , status , concert
		
		Statue statue1 = new Statue();
		Statue statue2 = new Statue();
		Statue statue3 = new Statue();
		
		statue1.setTimeTable(createRandomTimeTable());
		statue1.setName("statue1");
		statue2.setTimeTable(createRandomTimeTable());
		statue2.setName("statue2");
		statue3.setTimeTable(createRandomTimeTable());
		statue3.setName("statue3");
		
		Concert concert1 = new Concert();
		Concert concert2 = new Concert();
		
		concert1.setTimeTable(null);
		concert2.setTimeTable(null);
		
		
		List<Atraction> listAtractions= new ArrayList<>();
		listAtractions.add(statue1);
		listAtractions.add(statue2);
		listAtractions.add(statue3);
		listAtractions.add(concert1);
		listAtractions.add(concert2);
		
		//create trip
		
		Trip trip = new Trip("Trip1",listAtractions);
		trip.onlyVisitibleLocation();
		
		//create travelPlan
		TravelPlan travelPlan = new TravelPlan();
		for (Atraction atraction : listAtractions) {
            if (atraction instanceof Visitable) {
                travelPlan.addAttrcation(LocalDate.of(2025, 1, 5), atraction);
            }
        }
		
		System.out.print("problemsSolved(): " + travelPlan);
	}

}
