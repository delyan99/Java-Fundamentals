package RawData_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			String[] input = scan.nextLine().split("\\s+");
			String model = input[0];
			int engineSpeed = Integer.parseInt(input[1]);
			int enginePower = Integer.parseInt(input[2]);
			int cargoWeight = Integer.parseInt(input[3]);
			String cargoType = input[4];
			double tire1Pressure = Double.parseDouble(input[5]);
			int tire1Age = Integer.parseInt(input[6]);
			double tire2Pressure = Double.parseDouble(input[7]);
			int tire2Age = Integer.parseInt(input[8]);
			double tire3Pressure = Double.parseDouble(input[9]);
			int tire3Age = Integer.parseInt(input[10]);
			double tire4Pressure = Double.parseDouble(input[11]);
			int tire4Age = Integer.parseInt(input[12]);
			Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tire1Pressure, tire1Age,
					tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
			cars.add(car);
		}
		String cargotype = scan.nextLine();
		if ("fragile".equals(cargotype)) {
			for (Car car : cars) {
				if (cargotype.equals(car.getCargoType())) {
					if(car.getTire1() < 1 || car.getTire2() < 1 ||car.getTire3() < 1 || car.getTire4() < 1) {
						System.out.println(car.toString());
					}
				}
			}
		}else if("flamable".equals(cargotype)){
			for (Car car : cars) {
				if(car.getEnginePower() > 250) {
					System.out.println(car.toString());
				}
			}
		}

	}

}
