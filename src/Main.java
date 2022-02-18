import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner scan;
	ArrayList <Car> carList;
	ArrayList <Motorcycle> motorList;
	
	public Main() {
		scan = new Scanner(System.in);
		carList = new ArrayList <>();
		motorList = new ArrayList <>();
	}
	
	public void run() {
		int choose = 0;
		
		do {
			menu();
			choose = scanInt();
			
			switch(choose) {
			case 1:
				input();
				break;
				
			case 2:
				view();
				break;

			case 3:
				System.exit(0);
				break;
			}
		}while(choose != 3); 
	}
	
	public void menu() {
			System.out.println("PT Musang");
			System.out.println("=========");
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.print("Choose >>");
	}

	public void input() {
		String type = "";
		String merek = "";
		String nama = "";
		String plat = "";
		int speed = 0;
		int gasCap = 0;
		
		String tipeCar = "";
		int carWheel = 0;
		int entertainmentSystem = 0;
		
		String tipeMotor = "";
		int motorWheel = 0;
		int jumlahHelm = 0;
		
		Car mobil = new Car(type, merek, nama , plat, speed, gasCap,carWheel, tipeCar, entertainmentSystem); 
		Motorcycle motor = new Motorcycle(type,merek, nama , plat, speed, gasCap, motorWheel, tipeMotor, jumlahHelm);
			
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
			mobil.setTypeVehicle(type);
			motor.setTypeVehicle(type);
		}while(!(type.equals("Car") || type.equals("Motorcycle")));
	
		do {
			System.out.print("Input brand [>= 5]: ");
			merek = scan.nextLine();
			mobil.setBrand(merek);
			mobil.setBrand(merek);
		}while(merek.length() < 5);

		
		do {
			System.out.print("Input name [>= 5]: ");
			nama = scan.nextLine();
			mobil.setName(nama);
			motor.setName(nama);
		}while(nama.length() < 5);

		
		do {
			System.out.print("Input license: ");
			plat = scan.nextLine();
			mobil.setLicense(plat);
			motor.setLicense(plat);
		}while(!plat.matches("[A-Z] [0-9][0-9][0-9][0-9] [A-Z][A-Z][A-Z]"));
		
		
		do {
			System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
			speed = scanInt();
			mobil.setTopSpeed(speed);
			motor.setTopSpeed(speed);
		}while(speed <100 || speed > 250);

		do {
			System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCap = scanInt();
			mobil.setGasCapacity(gasCap);
			motor.setGasCapacity(gasCap);
		}while(gasCap < 30 || gasCap > 60);
		
				
		if(type.equals("Car")) {

			do {
				mobil.wheel();
				carWheel = scanInt();
				mobil.setCarWheel(carWheel);
			}while(carWheel < 4 || carWheel > 6);
			
			do {
				mobil.type();
				tipeCar = scan.nextLine();
				mobil.setCarType(tipeCar);
				}while(!(tipeCar.equals("SUV") || tipeCar.equals("Supercar") || tipeCar.equals("Minivan")));
			
			do {
				System.out.print("Input entertainment system amount [>=1]: ");
				entertainmentSystem = scanInt();
				mobil.setEntertainmentSystem(entertainmentSystem);
			}while(entertainmentSystem < 1);
			
			
		}else if(type.equals("Motorcycle")) {
			
			do {
				motor.wheel();
				motorWheel = scanInt();
				motor.setMotorWheel(motorWheel);
			}while(motorWheel < 2 || motorWheel > 3);
			
			do {
				motor.type();
				tipeMotor = scan.nextLine();
				motor.setMotorType(tipeMotor);
			}while(!(tipeMotor.equals("Automatic") || tipeMotor.equals("Manual")));
		
			do {
				System.out.print("Input helm amount [>= 1]: ");
				jumlahHelm = scanInt();
				motor.setHelm(jumlahHelm);
			}while(jumlahHelm < 1);
	
		}
		
		carList.add(mobil);
		motorList.add(motor);
		System.out.println("ENTER to return");
		scan.nextLine();
	
	}
	
	public void view() {
		int pick = 0;
		int price = 0;
		
		if(carList.isEmpty() && motorList.isEmpty()) {
			System.out.println("=============================================");
			System.out.printf("| %-5s | %-10s | %-20s |\n" , "No" , "Type", "Name"); 
			System.out.println("=============================================");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}else {
			System.out.println("=============================================");
			System.out.printf("| %-5s | %-10s | %-20s |\n" , "No" , "Type", "Name"); 
			System.out.println("=============================================");
			
			for(int i = 0; i < carList.size() || i< motorList.size(); i++) {
				System.out.println("=============================================");
				System.out.printf("| %-5s | %-10s | %-20s |\n" , (i+1), carList.get(i).getTypeVehicle(), carList.get(i).getName());
				System.out.println("=============================================");
			}
			
			do {
			System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
			pick = scanInt();
			}while(pick > carList.size() && pick > motorList.size());
			
			if(pick == 0) {
				scan.nextLine();
			}else {
				if(carList.get(pick-1).getTypeVehicle().equals("Car")) {
					System.out.println("Brand: " + carList.get(pick-1).getBrand());
					System.out.println("Name: " + carList.get(pick-1).getName());
					System.out.println("License Plate: " + carList.get(pick-1).getLicense());
					System.out.println("Type: " + carList.get(pick-1).getCarType());
					System.out.println("Gas Capacity: " + carList.get(pick-1).getGasCapacity());
					System.out.println("Top Speed: " + carList.get(pick-1).getTopSpeed());
					System.out.println("Wheel(s): " + carList.get(pick-1).getCarWheel());
					System.out.println("Entertainment System: " + carList.get(pick-1).getEntertainmentSystem());
					System.out.println("Turning on entertainment system...");

				
					if(carList.get(pick-1).getCarType().equals("Supercar")) {
						System.out.println("Boosting!");
					}
					
					scan.nextLine();
					
				}else if(carList.get(pick-1).getTypeVehicle().equals("Motorcycle")) {
					System.out.println("Brand: " + carList.get(pick-1).getBrand());
					System.out.println("Name: " + motorList.get(pick-1).getName());
					System.out.println("License Plate: " + motorList.get(pick-1).getLicense());
					System.out.println("Type: " + motorList.get(pick-1).getMotorType());
					System.out.println("Gas Capacity: " + motorList.get(pick-1).getGasCapacity());
					System.out.println("Top Speed: " + motorList.get(pick-1).getTopSpeed());
					System.out.println("Wheel(s): " + motorList.get(pick-1).getMotorWheel());
					System.out.println("Helm: " + motorList.get(pick-1).getHelm());
					System.out.println(motorList.get(pick-1).getName() + " is standing!");
					System.out.print("Input helm price: ");
					price = scanInt();
					System.out.println("Price: " + price);
					scan.nextLine();
				}
			}
			
		}
	}

	int scanInt() { 
		int input; 
			try {
				input = scan.nextInt();
			}catch (Exception e) {
				input = Integer.MIN_VALUE; 
			}
			scan.nextLine();
			return input;	
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

}
