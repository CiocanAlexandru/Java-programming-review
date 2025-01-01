package Lab2;

public class Lab2 {
   
	public void printEachTypeOfClases()
	{
		Client clientInstance = new Client("Clinet1", new TimeWindow(1,2), ClientType.PREMIUM);
		Depot depotInstance = new Depot("Depot1");
		Vehicle vehicleInstance = new Vehicle(1,depotInstance,10);
		
		System.out.print("printEachTypeOfClases(): " + clientInstance.toString() + "\n");
		System.out.print("printEachTypeOfClases(): " + depotInstance.toString() + "\n");
		System.out.print("printEachTypeOfClases(): " + vehicleInstance.toString() + "\n");
	}
	
	public void problemsSolved()
	{
		printEachTypeOfClases();
	}
	
}
