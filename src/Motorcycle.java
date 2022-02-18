
public class Motorcycle extends Vehicle{

	private int helm;
	private int motorWheel;
	private String motorType;
	

	public Motorcycle(String typeVehicle,String brand, String name, String license,  int topSpeed, int gasCapacity, int motorWheel, String motorType, int helm) {
		super(typeVehicle,brand, name, license, topSpeed, gasCapacity);
	}


	public void wheel() {
		System.out.print("Input Wheel [2 <= wheel <= 3]: ");
	}
	
	public void type() {
		System.out.print("Input Type [Automatic| Manual]: ");
	}

	public int getMotorWheel() {
		return motorWheel;
	}


	public void setMotorWheel(int motorWheel) {
		this.motorWheel = motorWheel;
	}


	public String getMotorType() {
		return motorType;
	}


	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public int getHelm() {
		return helm;
	}

	public void setHelm(int helm) {
		this.helm = helm;
	}

}
