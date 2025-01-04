package Lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Concert extends Atraction implements Visitable,Payable
{
	private Map<LocalDate, TimeInterval> timeTable = new HashMap<>();
	private double ticketPrice;

	
	
	public void setTimeTable(Map<LocalDate, TimeInterval> timeTable) 
	{
		this.timeTable = timeTable;
	}

	public void setTicketPrice(double ticketPrice) 
	{
		this.ticketPrice = ticketPrice;
	}

	@Override
	public double getTicketPrice() 
	{
		return this.ticketPrice;
	}

	@Override
	public Map<LocalDate, TimeInterval> getTimeTable() 
	{
		return this.timeTable;
	}

	@Override
	public String toString() 
	{
		return "Concert [timeTable=" + timeTable + ", ticketPrice=" + ticketPrice + "]";
	}
	
}
