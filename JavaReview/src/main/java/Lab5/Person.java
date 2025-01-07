package Lab5;

public class Person 
{
    private final String name;
	private final int id;

	public Person(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", id=" + id + "]";
	}
}
