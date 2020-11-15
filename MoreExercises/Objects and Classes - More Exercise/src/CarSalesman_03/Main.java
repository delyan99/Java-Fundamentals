package CarSalesman_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Engine> engines = new ArrayList<>();
		List<Car> cars = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] engineInformation = scan.nextLine().split("\\s+");
			String model = engineInformation[0];
			int power = Integer.parseInt(engineInformation[1]);
			if(engineInformation.length == 4) {
				int displacement = Integer.parseInt(engineInformation[2]);
				String efficiency = engineInformation[3];
				Engine engine = new Engine(model, power, displacement, efficiency);
				engines.add(engine);
			}else if(engineInformation.length == 3) {
				boolean flag = true;
				for (char c : engineInformation[2].toCharArray()) {
					if(!Character.isDigit(c)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					int displacement = Integer.parseInt(engineInformation[2]);
					Engine engine = new Engine(model, power, displacement);
					engines.add(engine);
				}else {
					String efficiency = engineInformation[2];
					Engine engine = new Engine(model, power, efficiency);
					engines.add(engine);
				}
			}else if(engineInformation.length == 2) {
				Engine engine = new Engine(model, power);
				engines.add(engine);
			}
		}
		
		int m = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < m; i++) {
			String[] carInformation = scan.nextLine().split("\\s+");
			String model = carInformation[0];
			String engine = carInformation[1];
			if(carInformation.length == 2) {
				Car car = new Car(model, engine);
				cars.add(car);
			}else if(carInformation.length == 4) {
				int weight = Integer.parseInt(carInformation[2]);
				String color = carInformation[3];
				Car car = new Car(model, engine, weight, color);
				cars.add(car);
			}else if(carInformation.length == 3){
				boolean flag = true;
				for (char c : carInformation[2].toCharArray()) {
					if(!Character.isDigit(c)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					int weight = Integer.parseInt(carInformation[2]);
					Car car = new Car(model, engine, weight);
					cars.add(car);
				}else {
					String color = carInformation[2];
					Car car = new Car(model, engine, color);
					cars.add(car);
				}
			}
		}
		for (Car car : cars) {
			System.out.println(car.getModel() + ":");
			System.out.println(car.getEngine()+ ":");
			for (Engine engine : engines) {
				if(engine.getModel().equals(car.getEngine())) {
				System.out.println("Power: " + engine.getPower());
				if(engine.getDisplacement() == 0) {
					System.out.println("Displacement: n/a" );
				}else {
					System.out.println("Displacement: " + engine.getDisplacement());
				}
				if(engine.getEfficiency() == null) {
					System.out.println("Efficiency: n/a" );
				}else {
					System.out.println("Efficiency: " + engine.getEfficiency());
				}
				}
			}
			if(car.getWeight() == 0) {
				System.out.println("Weight: n/a");
			}else {
				System.out.println("Weight: " + car.getWeight());
			}
			String rez = car.getColor();
			if(rez != null) {
				System.out.println("Color: " + car.getColor());	
			}else {
				System.out.println("Color: n/a");
			}
		}

	}

}
