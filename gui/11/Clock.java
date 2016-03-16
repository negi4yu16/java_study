package src;

import java.util.Calendar;

public class Clock {

	public Clock(){
	}

	public String toString(){

		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = Calendar.getInstance().get(Calendar.SECOND);
		return hour + ":" + minute + ":" + second;
	}
}
