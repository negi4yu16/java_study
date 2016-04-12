package src.ex03;

public class CheckWorkingDay {

	static public boolean checkIfElse(Weekday day){

		boolean ret = false;
		if(day.equals(Weekday.MONDAY)){
			ret = true;
		}
		else if(day.equals(Weekday.TUESDAY)){
			ret = true;
		}
		else if(day.equals(Weekday.WEDNESDAY)){
			ret = true;
		}
		else if(day.equals(Weekday.THURSDAY)){
			ret = true;
		}
		else if(day.equals(Weekday.FRIDAY)){
			ret = true;
		}
		else if(day.equals(Weekday.SATURDAY)){
			ret = false;
		}
		else if(day.equals(Weekday.SUNDAY)){
			ret = false;
		}

		return ret;
	}

	static public boolean checkSwitch(Weekday day){

		boolean ret = false;
		switch(day){
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			ret = true;
			break;
		case SATURDAY:
		case SUNDAY:
		default:
			ret = false;
			break;
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean result = false;

		result = CheckWorkingDay.checkIfElse(Weekday.MONDAY);
		System.out.println("MONDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.MONDAY);
		System.out.println("MONDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.TUESDAY);
		System.out.println("TUESDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.TUESDAY);
		System.out.println("TUESDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.WEDNESDAY);
		System.out.println("WEDNESDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.WEDNESDAY);
		System.out.println("WEDNESDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.THURSDAY);
		System.out.println("THURSDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.THURSDAY);
		System.out.println("THURSDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.FRIDAY);
		System.out.println("FRIDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.FRIDAY);
		System.out.println("FRIDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.SATURDAY);
		System.out.println("SATURDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.SATURDAY);
		System.out.println("SATURDAY:" + result);

		result = CheckWorkingDay.checkIfElse(Weekday.SUNDAY);
		System.out.println("SUNDAY:" + result);
		result = CheckWorkingDay.checkSwitch(Weekday.SUNDAY);
		System.out.println("SUNDAY:" + result);

	}

}
