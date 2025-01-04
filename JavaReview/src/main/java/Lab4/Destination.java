package Lab4;

public class Destination {
	
	private String name ;

	public Destination(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + "]";
	}
	
	
}
