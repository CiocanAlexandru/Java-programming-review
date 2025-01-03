package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Depot 
{
	private String name;
	
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public Depot(String name) 
	{
		super();
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Vehicle> getVehicleList() 
	{
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) 
	{
		this.vehicleList = vehicleList;
	}

	public void addVehicle(Vehicle obj)
	{
		
		if (!this.vehicleList.contains(obj))
		{
			this.vehicleList.add(obj);
			obj.setDepot(this);
		}
		else
		{
			System.out.print("addVehicle(): Vehicle arleady assign in this depot!! " + obj);
		}
	}
	
	@Override
	public String toString() 
	{
		return "Depot [name=" + name + ", vehicleList=" + vehicleList + "]";
	}
	
}
