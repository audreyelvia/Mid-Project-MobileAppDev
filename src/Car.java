
public class Car extends Vehicle{
	
	private int entertainmentSystem;
	private int carWheel;
	private String carType;
	

	public Car(String typeVehicle, String brand, String name, String license, int topSpeed, int gasCapacity, int carWheel, String carType, int entertainmentSystem) {
		super(typeVehicle, brand, name, license, topSpeed, gasCapacity);
		
	}
	
	public void wheel() {
		System.out.print("Input Wheel [4 <= wheel <=6]: ");
	}
	
	public void type() {
		System.out.print("Input Type [SUV | Supercar | Minivan]: ");
	}
	
	public int getCarWheel() {
		return carWheel;
	}

	public void setCarWheel(int carWheel) {
		this.carWheel = carWheel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public void setEntertainmentSystem(int entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}

}

