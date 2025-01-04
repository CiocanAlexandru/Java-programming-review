package Lab3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Trip 
{
	
	private String name;
	
	private List<Atraction> listAtractions = new ArrayList<>();

	public Trip(String name, List<Atraction> listAtractions) 
	{
		super();
		this.name = name;
		this.listAtractions = listAtractions;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Atraction> getListAtractions() 
	{
		return listAtractions;
	}

	public void setListAtractions(List<Atraction> listAtractions)
	{
		this.listAtractions = listAtractions;
	}

	@Override
	public String toString() 
	{
		return "Trip [name=" + name + ", listAtractions=" + listAtractions + "]";
	}
	
	public void onlyVisitibleLocation()
	{
		//display the locations that are visitable and are not payable, sorted by their opening hour.
		List<Atraction> onlyVisitedInstance = new ArrayList<>();
		
		for (Atraction atraction : this.listAtractions )
		{
			if ((atraction instanceof Visitable) && !(atraction instanceof Payable))
			{
				onlyVisitedInstance.add(atraction);
			}
		}
		
		Collections.sort(onlyVisitedInstance, new Comparator<Atraction>() {

			@Override
			public int compare(Atraction o1, Atraction o2) {
				
				LocalDate today = LocalDate.now(); 
				Visitable v1 = (Visitable) o1;
	            Visitable v2 = (Visitable) o2;
	            
				return v1.openingDate(today).compareTo(v2.openingDate(today));
			}	
			
		});
		
		for (Atraction atraction : onlyVisitedInstance )
		{
			System.out.print("onlyVisitibleLocation(): " + atraction + "\n");
		}

			
	}
		
}
