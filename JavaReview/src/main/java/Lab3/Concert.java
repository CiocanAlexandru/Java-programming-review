package Lab3;

import java.time.LocalDate;
import java.util.Map;

public class Concert extends Atraction implements Visitable,Payable
{
	private double ticketprice; 

	public double getTicketprice() 
	{
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) 
	{
		this.ticketprice = ticketprice;
	}

	public Concert(double ticketprice) 
	{
		super();
		this.ticketprice = ticketprice;
	}

	@Override
	public double getTicketPrice() 
	{
		return this.ticketprice;
	}

	@Override
	public Map<LocalDate, TimeInterval> getTimeInterval() 
	{
		return null;
	}
	
	@Override
	public String toString() 
	{
		return "Concert [ticketprice=" + ticketprice + "]";
	}

	@Override
	public Map<LocalDate, TimeInterval> getTimetable() {
		// TODO Auto-generated method stub
		return null;
	}

}
