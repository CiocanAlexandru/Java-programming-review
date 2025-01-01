package Lab2;

final public class Client 
{
	private String name;
	
	private TimeWindow timeWindow;
	
	private ClientType clientType;

	public Client(String name, TimeWindow timeWindow, ClientType clientType) 
	{
		super();
		this.name = name;
		this.timeWindow = timeWindow;
		this.clientType = clientType;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public TimeWindow getTimeWindow()
	{
		return timeWindow;
	}

	public void setTimeWindow(TimeWindow timeWindow) 
	{
		this.timeWindow = timeWindow;
	}

	public ClientType getClientType() 
	{
		return clientType;
	}

	public void setClientType(ClientType clientType) 
	{
		this.clientType = clientType;
	}

	@Override
	public String toString() 
	{
		return "Client [name=" + name + ", timeWindow=" + timeWindow + ", clientType=" + clientType + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
		    return false; 
		}
		if (obj == null || getClass() != obj.getClass()) 
		{
		    return false; 
		}
		
		return this.name == ((Client)obj).name;
	}
	
	
}
