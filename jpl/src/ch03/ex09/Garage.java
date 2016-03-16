package src.ch03.ex09;

import src.ch03.ex08.Vehicle;

public class Garage implements Cloneable {

	private Vehicle[] vehicles;
	private int MAX = 10;

	public Garage(){
		vehicles = new Vehicle[MAX];
	}

	public Garage(Vehicle[] vehicles){
		this.vehicles = vehicles;
	}
	public Vehicle[] getVehicles(){
		return vehicles;
	}

	public Garage clone() throws CloneNotSupportedException {
		Garage garage = null;
		try{
			garage  = (Garage)super.clone();
			garage.vehicles = vehicles.clone();
		}catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
		return garage;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vehicle v1 = new Vehicle("Yamada");
		Vehicle v2 = new Vehicle("Satoh");
		Vehicle v3 = new Vehicle("Suzuki");

		Vehicle[] vehicles = {v1, v2, v3};
		Garage garage1 = new Garage(vehicles);
		try {
			Garage garage2 = garage1.clone();
			Vehicle v4 = garage2.getVehicles()[0];
			Vehicle v5 = garage2.getVehicles()[1];
			Vehicle v6 = garage2.getVehicles()[2];

			System.out.println("[Garage1:v1]"+ v1.toString());
			System.out.println("[Garage1:v2]"+ v2.toString());
			System.out.println("[Garage1:v3]"+ v3.toString());
			System.out.println("[Garage2:v4]"+ v4.toString());
			System.out.println("[Garage2:v5]"+ v5.toString());
			System.out.println("[Garage2:v6]"+ v6.toString());
			v4.setOwner("Yamazaki");
			System.out.println("after change owner");
			System.out.println("[Garage1:v1]"+ v1.toString());
			System.out.println("[Garage2:v4]"+ v4.toString());


		}catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}

	}

}
