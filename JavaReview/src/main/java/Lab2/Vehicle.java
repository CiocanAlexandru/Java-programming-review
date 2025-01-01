package Lab2;

import java.util.ArrayList;
import java.util.List;

final public class Vehicle 
{

	int id;
	
	private Depot depot;
	
	private List <Client> visitedClients = new ArrayList<Client>();
	
	private int startWokingHour;
	
	public Vehicle(int id, Depot depot, int startWokingHour) 
	{
		super();
		this.id = id;
		this.depot = depot;
		this.startWokingHour = startWokingHour;
	}

	public int getStartWokingHour() 
	{
		return startWokingHour;
	}

	public void setStartWokingHour(int startWokingHour) 
	{
		this.startWokingHour = startWokingHour;
	}

	public Depot getDepot() 
	{
		return depot;
	}

	public void setDepot(Depot depot) 
	{
		this.depot = depot;
	}

	public List<Client> getVisitedClients() 
	{
		return visitedClients;
	}

	public void setVisitedClients(List<Client> visitedClients) 
	{
		this.visitedClients = visitedClients;
	}


	@Override
	public String toString() {
		return "Vehicle [depot=" + depot + ", visitedClients=" + visitedClients + ", startWokingHour=" + startWokingHour
				+ "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
		    return false; 
		}
		if (obj == null || getClass() != obj.getClass()) 
		{
		    return false; 
		}
		return this.id == ((Vehicle)obj).id;
	}
	
	
}
