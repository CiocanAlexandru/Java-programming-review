package Lab3;

import java.time.LocalTime;

public class TimeInterval extends Pair<LocalTime,LocalTime> {

	@Override
	public String toString() {
		return "TimeInterval [getFirst()=" + getFirst() + ", getSecond()=" + getSecond() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
