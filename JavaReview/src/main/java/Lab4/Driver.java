package Lab4;

public class Driver extends Person{

	public Driver(int age, String name , Destination destination) 
	{
		super(age,name, destination);
	}

	@Override
	public String toString() {
		return "Driver [getAge()=" + getAge() + ", getName()=" + getName() + ", getDestination()=" + getDestination()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
