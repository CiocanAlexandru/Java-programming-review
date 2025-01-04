package Lab3;

import java.time.LocalTime;

public class TimeInterval extends Pair<LocalTime,LocalTime> {

	public TimeInterval(LocalTime first, LocalTime second)
	{
	  super.setFirst(first);
	  super.setSecond(second);
	}
	
	@Override
	public String toString() {
		return "TimeInterval [getFirst()=" + getFirst() + ", getSecond()=" + getSecond() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
