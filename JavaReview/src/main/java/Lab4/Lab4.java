package Lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class Lab4 {

	private List<Person> listOfPersons = new ArrayList<>();
	
	//Use a third-party library in order to generate random fake names for persons and destinations
	private void generatePersons(int numberOfPersons)
	{
		
		Faker fakerGenerator = new Faker();
		List<String> generatedDestinationNames = new ArrayList<>();
		
		for(int i = 0; i < numberOfPersons/2; i++)
		{
			generatedDestinationNames.add(fakerGenerator.address().city());
		}
		
		for(int i = 0; i < numberOfPersons; i++)
		{
			int age = i+20;
			String name = fakerGenerator.name().lastName() ;
			Destination destination = new Destination(generatedDestinationNames.get((int)(Math.random()*100%5)));
			if(i%2==0)
			{
				this.listOfPersons.add(new Driver(age,name,destination));
			}
			else 
			{
				this.listOfPersons.add(new Passager(age,name,destination));
			}
		}
		
		for(Person i : this.listOfPersons)
		{
			System.out.print("generatePersons():"+i+"\n");
		}
	}
	
	public void problemsSolved()
	{
	
		//Create a random group of persons. Use streams in order to filter the drivers and the passengers
		int numberofPersons = 10;
		generatePersons(numberofPersons);
		
		this.listOfPersons.stream()
                          .filter(p -> p instanceof Driver)
                          .forEach(x -> System.out.print("problemsSolved() Only Driver" + x + "\n"));
				                    
		
		
		 this.listOfPersons.stream()
						   .filter(p -> p instanceof Passager)
						   .forEach(x -> System.out.print("problemsSolved() Only Passager" + x + "\n"));
	
		
		//Put all the drivers in a LinkedList and print them sorted by their age  
		 LinkedList<Person> onlyDrivers = this.listOfPersons.stream()  
														    .filter(p -> p instanceof Driver) 
														    .sorted(Comparator.comparingInt(Person::getAge))  
														    .collect(Collectors.toCollection(LinkedList::new));
		
		//Put all the passengers in a TreeSet and print them sorted by their name
		 TreeSet<Person> onlyPassager = this.listOfPersons.stream()  
														  .filter(p -> p instanceof Passager) 
													      .sorted(Comparator.comparing(Person::getName))  
													      .collect(Collectors.toCollection(TreeSet::new));
		 
		//compute a list of all the destinations that the drivers pass through
		 List<Destination> driversDestinations = onlyDrivers.stream()
															.map(Person::getDestination)
															.collect(Collectors.toList());
			 
	}
}
