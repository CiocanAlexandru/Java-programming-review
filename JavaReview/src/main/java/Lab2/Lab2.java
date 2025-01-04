package Lab2;

import java.util.LinkedList;
import java.util.Queue;

public class Lab2 {
   
	private int [][] hourBetweenClinets;
	private int [] hourBetweenDeposAndClients;
	private Depot [] depots; 
	private Client [] clients;
	private Vehicle [] vehicles;
	
	private int generateRandomHour()
	{
		return (int)(Math.random()*1_000_00) % 10;
	}
	
	private void generateMatrix(int n)
	{
		this.hourBetweenClinets = new int [n][n];
		for (int i = 0; i < n; i++)
			for(int j = 0; j < n ; j++)
				if (i != j)
					this.hourBetweenClinets[i][j] = generateRandomHour()+1;
				else
					this.hourBetweenClinets[i][j] = 0;
		
	}
	
	private void generateList(int n)
	{
		this.hourBetweenDeposAndClients = new int [n];
		for (int i = 0;i < n; i++)
			this.hourBetweenDeposAndClients[i] = generateRandomHour()+1;
	}
	
	private void printMatrixandVector()
	{
		System.out.print("printMatrixandVector() : Vector of hour between depos and all clients is ");
		for(int i = 0; i < this.hourBetweenDeposAndClients.length ;i++)
		{
			System.out.print(this.hourBetweenDeposAndClients[i] + " ");
		}
		
		System.out.print("\n");
		
		System.out.println("printMatrixandVector() : Mattrix of hour between is:");
        for (int i = 0; i < this.hourBetweenClinets.length; i++) 
        { 
            for (int j = 0; j < this.hourBetweenClinets[i].length; j++) 
            { 
                System.out.print(this.hourBetweenClinets[i][j] + " "); 
            }
            System.out.println("\n"); 
        }
	}
	
	
	public void printEachTypeOfClases()
	{
		Client clientInstance = new Client("Clinet1", new TimeWindow(), ClientType.PREMIUM);
		Depot depotInstance = new Depot("Depot1");
		Vehicle vehicleInstance = new Vehicle(1,10);
		depotInstance.addVehicle(vehicleInstance);
		
		System.out.print("printEachTypeOfClases(): " + clientInstance + "\n");
		System.out.print("printEachTypeOfClases(): " + depotInstance + "\n");
		System.out.print("printEachTypeOfClases(): " + vehicleInstance + "\n");
		
	}
	
	private void heuristicSolution()
	{
		//Create depots
        
		int nrDepots = 2;
		this.depots = new Depot[nrDepots];
		for (int i = 0; i < nrDepots; i++)
		{
			this.depots[i]=new Depot("Depot"+i);
			System.out.print(this.depots[i]+"\n");
			
		}
		
		// Create vehicles
		
		int nrVehicles = 10;
		this.vehicles = new Vehicle[nrVehicles];
		for (int i = 0; i < nrVehicles; i++)
		{
			this.vehicles[i]=new Vehicle(i,i+8);
		}
		
		// Assign vehicle to depots
		for (int i = 0; i < nrVehicles; i++)
		{
			if (i % 2 ==0)
			{
				this.depots[0].addVehicle(this.vehicles[i]);
			}
			else
			{
				this.depots[1].addVehicle(this.vehicles[i]);
			}
			System.out.print(this.vehicles[i]+"\n");
		}
		
		
		//Create Clients
		
		int nrClients = 10;
		this.clients = new Client[nrClients];
		for (int i = 0; i < nrClients; i++)
		{
			this.clients[i] = new Client("Clients"+i,new TimeWindow(),ClientType.REGULAR);
			System.out.print(this.clients[i]+"\n");
		}
		
		generateMatrix(nrClients);
		generateList(nrClients);
		printMatrixandVector();	
		
		for (int d = 0; d < nrDepots; d++)
		{
			// Need to choose the first client to serve closes and the early one
			int firstClient = 0;
			for (Vehicle vehicle : this.depots[d].getVehicleList())
			{
				int minTimeArrived = 10000;
				for (int i = 0; i<nrClients ; i++)
				{
					if (vehicle.getStartWokingHour() + this.hourBetweenDeposAndClients[i]<minTimeArrived && 
						vehicle.getStartWokingHour() + this.hourBetweenDeposAndClients[i]<=this.clients[i].getTimeWindow().getEndInterval())
					{
						minTimeArrived = vehicle.getStartWokingHour() + this.hourBetweenDeposAndClients[i];
						firstClient = i;
					}
					
				}
				
				System.out.print(vehicle+" "+"Fisrt client is Client" + firstClient + "\n");
				vehicle.addClinetsViseted(this.clients[firstClient]);
				
				
				//Now need to serve the rest of the clients
				boolean []visited = new boolean [nrClients];
				visited[firstClient] = true;
				
				Queue<Integer> queueList = new LinkedList<>();
				queueList.add(firstClient);
				
				int copyMinTimeArrived = minTimeArrived;
				while (!queueList.isEmpty())
				{
					int newClient = queueList.poll();
					int prevClient = newClient;
					for (int i = 0 ;i< nrClients ;i++)
					{
						if (visited[i]!= true && i!=newClient && 
							copyMinTimeArrived + this.hourBetweenClinets[newClient][i]<= this.clients[i].getTimeWindow().getEndInterval())
						{
							newClient = i;
							copyMinTimeArrived = copyMinTimeArrived + this.hourBetweenClinets[newClient][i];
							break;
						}
	
					}
					
					if (prevClient != newClient)
					{
						queueList.add(newClient);
						visited[newClient] = true;
						vehicle.getVisitedClients().add(this.clients[newClient]);
					}
				}
				 
			}
	  }
		
	}
	
	public void problemsSolved()
	{
		printEachTypeOfClases();
		heuristicSolution();
		
		for (int d = 0; d < this.depots.length; d++)
		{
			System.out.print("Clients visited by the vehicle from depot" + d + "\n");
			for(Vehicle vehicle : this.depots[d].getVehicleList())
			{
				System.out.print(vehicle + "\n");
				for(Client clients: vehicle.getVisitedClients())
				{
					System.out.print(clients + "\n");
				}
			}
			System.out.print("\n");
		}
		
		
	}
	
}
