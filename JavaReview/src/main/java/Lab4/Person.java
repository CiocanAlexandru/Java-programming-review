package Lab4;

public class Person implements Comparable<Person>{

	private int age;
	private String name;
	private Destination destination;
	
	public Person(int age, String name,Destination destination) 
	{
		super();
		this.age = age;
		this.name = name;
		this.destination = destination;
	}

	public int getAge() 
	{
		return age;  
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	@Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", destination=" + destination + "]";
	}

	
	
}
