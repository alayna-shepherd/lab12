package lab12;

import java.util.ArrayList;

public class UsedCarApp {

	public static void main(String[] args) {

		ArrayList<Car> usedCars = new ArrayList<>();
		usedCars.add(new usedCars("Toyota", "Celica", 1998, 1200.00, 139000));
		usedCars.add(new usedCars("Dodge", "Ram", 2012, 4000.00, 76000));
		usedCars.add(new usedCars("Pontiac", "G6", 2003, 2100.00, 112830));
		usedCars.add(new Car("Kia", "Telluride", 2019, 2030));
		usedCars.add(new Car("Volvo", "XC90", 2019, 1033));
		usedCars.add(new Car("Honda", "Civic", 2019, 77576));
		String restart = "yes";
			
		int userNum;
		
		do {
			for (int x = 0; x < usedCars.size(); x++) {
				System.out.println(usedCars.get(x));
			}
			System.out.println("Cars are listed in order 1 - 6. Please select the car you would like to buy");
			userNum = scan.nextInt();
			System.out.println(usedCars.get(userNum));
			System.out.println("was this your car? Yes/No");
			String userAnswer = scan.next();
			if (userAnswer.equalsIgnoreCase("yes")) {
				usedCars.remove(userNum);
				for (int x = 0; x < usedCars.size(); x++) {
					System.out.println(usedCars.get(x));}
					restart = "turtle";
					break;
				
			} else if (userAnswer.equalsIgnoreCase("no")) {
				continue;
			} else {
				System.out.println("Yes or no not found here let me restart you");
				continue;
			}

		} while (restart.equalsIgnoreCase("yes"));

	}

}
