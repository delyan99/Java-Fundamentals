package VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		List<Car> cars = new ArrayList<>();
		List<Truck> trucks = new ArrayList<>();
		double carAverageHorsepower = 0.0;
		int carCounter = 0;
		int carHorsepower = 0;
		double truckAverageHorsepower = 0.0;
		int truckCounter = 0;
		int truckHorsepower = 0;
		while (!input.equals("End")) {
			String[] tokens = input.split("\\s++");
			String typeOfVehicle = tokens[0];
			String model = tokens[1];
			String color = tokens[2];
			int horsepower = Integer.parseInt(tokens[3]);
			if (typeOfVehicle.equals("car")) {
				Car car = new Car(model, color, horsepower);
				cars.add(car);
			} else  if(typeOfVehicle.equals("truck")){
				Truck truck = new Truck(model, color, horsepower);
				trucks.add(truck);
			}

			input = scan.nextLine();
		}
		input = scan.nextLine();
		while (!input.equals("Close the Catalogue")) {
			boolean flag = true;
			for (Car car : cars) {
				if (flag) {
					if (car.getModel().equals(input)) {
						System.out.println("Type: Car");
						System.out.println(car.toString());
						flag = false;
					}
				}
				carHorsepower += car.getHoursepower();
				carCounter++;

			}
			for (Truck truck : trucks) {
				if (flag) {
					if (truck.getModel().equals(input)) {
						System.out.println("Type: Truck");
						System.out.println(truck.toString());
						flag = false;
					}
				}
				truckHorsepower += truck.getHoursepower();
				truckCounter++;
			}


			input = scan.nextLine();
		}
		
		for (Car car : cars) {
			carHorsepower += car.getHoursepower();
			carCounter++;

		}
		for (Truck truck : trucks) {
			truckHorsepower += truck.getHoursepower();
			truckCounter++;
		}
		if(cars.size() > 0) {
			carAverageHorsepower = carHorsepower * 1.0 / carCounter;
		}else {
			carAverageHorsepower = 0.0;
		}
		System.out.println(String.format("Cars have average horsepower of: %.2f.", carAverageHorsepower));
		if(trucks.size() > 0) {
			truckAverageHorsepower = truckHorsepower * 1.0 / truckCounter;
		}else {
			truckAverageHorsepower = 0.0;
		}
		System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckAverageHorsepower));
	}

}
