package Lab2;

import java.util.ArrayList;
import java.util.List;

final public class Vehicle 
{

	int id;
	
	private Depot depot;
	
	private List <Client> visitedClients = new ArrayList<Client>();
	
	private int startWokingHour;
	
	public Vehicle(int id, int startWokingHour) 
	{
		super();
		this.id = id;
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

	public void addClinetsViseted(Client obj)
	{
		this.visitedClients.add(obj);
	}

	@Override
	public String toString() {
		String depotName = (depot != null) ? depot.getName() : "No Depot";
		return "Vehicle [depot=" + depotName + ", visitedClients=" + visitedClients + ", startWokingHour=" + startWokingHour
				+ "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
		    return true; 
		}
		if (obj == null || getClass() != obj.getClass()) 
		{
		    return false; 
		}
		return this.id == ((Vehicle)obj).id;
	}
	
	
}
