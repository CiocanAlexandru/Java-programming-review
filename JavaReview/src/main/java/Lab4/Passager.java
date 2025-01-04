package Lab4;

public class Passager extends Person{

	public Passager(int age, String name, Destination destination) 
	{
		super(age, name, destination);
	}

	@Override
	public String toString() {
		return "Passager [getAge()=" + getAge() + ", getName()=" + getName() + ", getDestination()=" + getDestination()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
