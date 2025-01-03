package Lab2;

import java.util.Random;

final public class TimeWindow 
{
	private int beginInteval;
	
	private int endInterval;
	
	public TimeWindow() 
	{
		super();		
		Random rand = new Random();

		this.beginInteval = rand.nextInt(11) + 8;  
        int duration = rand.nextInt(4) + 1;  
        this.endInterval = this.beginInteval + duration;

        if (this.endInterval > 22) 
        {
            this.endInterval = 22;
        }
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
