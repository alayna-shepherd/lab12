package lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>(); 
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");
		Scanner scan = new Scanner(System.in);
		int addNum = scan.nextInt();
		for (int i = 0; i < addNum; i++) {
			//format to add numbered items to list 
			System.out.print("Enter Car# " + (i+1) + " Make: ");
			String make = scan.next();
			System.out.print("Enter Car# " + (i+1) + " Model:");
			String model = scan.next();
			System.out.print("Enter Car# " + (i+1) + " Year:");
			int year= scan.nextInt();
			System.out.print("Enter Car# " + (i+1) + " Price: ");
			double price = scan.nextDouble();
			cars.add(new Car(make, model, year, price));	
		}
		scan.close();
		System.out.println("");
		System.out.println("Current Inventory");
		System.out.println(cars);
		
		
	}

	}


