package Lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Concert extends Atraction implements Visitable,Payable
{
	private double ticketPrice; 
	private Map<LocalDate, TimeInterval> timeInterval = new HashMap<>();
	
	public Map<LocalDate, TimeInterval> getTimeInterval() 
	{
		return timeInterval;
	}
	
	public void setTimeInterval(Map<LocalDate, TimeInterval> timeInterval) 
	{
		this.timeInterval = timeInterval;
	}
	
	public void setTicketPrice(double ticketPrice) 
	{
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public double getTicketPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Map<LocalDate, TimeInterval> getTimetable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() 
	{
		return "Concert [ticketprice=" + ticketPrice + ", timeInterval=" + timeInterval + "]";
	}
	
	
}
