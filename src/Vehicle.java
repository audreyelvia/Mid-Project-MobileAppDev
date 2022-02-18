import java.util.Scanner;
abstract class Vehicle {

	Scanner scan = new Scanner(System.in); 
	
	private String typeVehicle;
	private String brand;
	private String name;
	private String license;
	private int topSpeed;
	private int gasCapacity;


	public Vehicle(String typeVehicle, String brand, String name, String license, int topSpeed, int gasCapacity) {
	this.typeVehicle = typeVehicle;
	this.brand= brand;
	this.name = name;
	this.license = license;
	this.topSpeed = topSpeed;
	this.gasCapacity = gasCapacity;
	}
	
	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getGasCapacity() {
		return gasCapacity;
	}

	public void setGasCapacity(int gasCapacity) {
		this.gasCapacity = gasCapacity;
	}

	abstract void wheel();
	abstract void type();

}
