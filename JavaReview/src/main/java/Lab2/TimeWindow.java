package Lab2;


final public class TimeWindow 
{
	private int beginInteval;
	
	private int endInterval;
	
	public TimeWindow(int beginInteval, int endInterval) 
	{
		super();
		this.beginInteval = beginInteval;
		this.endInterval = endInterval;
	}
	
	public int getBeginInteval() 
	{
		return beginInteval;
	}
	
	public void setBeginInteval(int beginInteval)
	{
		this.beginInteval = beginInteval;
	}
	
	public int getEndInterval() 
	{
		return endInterval;
	}
	
	public void setEndInterval(int endInterval)
    {
		this.endInterval = endInterval;
	}

	@Override
	public String toString() {
		return "TimeWindow [beginInteval=" + beginInteval + ", endInterval=" + endInterval + "]";
	}
	
	
	
}
