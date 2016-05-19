package src;

import java.util.Calendar;

public class Clock {

	public Clock(){
	}

	public String getCurrentTime(){

		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = Calendar.getInstance().get(Calendar.SECOND);
		String out = String.format("%02d", hour)
				+ ":" + String.format("%02d", minute)
				+ ":" + String.format("%02d", second);
		//System.out.println("現在時刻"+out);
		return out;

	}
	public String getCurrentDate(){

		return "test";

	}
}
