package src.ch03.ex04;

public class PassengerVehicle extends Vehicle {

	private int seet;
	private int passenger;
	private final int DEFAULT_SEET = 4;
	private final int DEFAULT_PASSENGER = 0;

	public PassengerVehicle(){
		this.seet = DEFAULT_SEET;
		this.passenger = DEFAULT_PASSENGER;
	}

	public PassengerVehicle(int seet, int passenger){
		super();
		this.seet = seet;
		this.passenger = passenger;
	}

	final public int getSeet() {
		return seet;
	}
	public void setSeet(int seet) {
		this.seet = seet;
	}
	final public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger)	{
		if( (passenger <= this.getSeet()) && (passenger >= 0) ){
			this.passenger = passenger;
		}
	}

	public static void main(String[] args){

		int seet1 = 4, passenger1 = 1;
		PassengerVehicle car1 = new PassengerVehicle(seet1, passenger1);
		int seet2 = 6, passenger2 = 4;
		PassengerVehicle car2 = new PassengerVehicle(seet2, passenger2);
		System.out.println("PassengerVehicle:"+car1.getIdNumber()
							+ "(seet:"+car1.getSeet()
							+ " passenger:"+ car1.getPassenger()
							+ ")"
						);
		System.out.println("PassengerVehicle:"+car2.getIdNumber()
							+ "(seet:"+car2.getSeet()
							+ " passenger:"+ car2.getPassenger()
							+ ")"
						);
	}
}
