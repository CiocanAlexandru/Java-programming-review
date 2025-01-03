package Lab3;

import java.util.ArrayList;
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
	}
		
}
