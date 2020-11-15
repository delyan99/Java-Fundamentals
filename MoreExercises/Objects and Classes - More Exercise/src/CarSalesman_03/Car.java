package CarSalesman_03;

public class Car {
	private String model;
	private String engine;
	private int weight;
	private String color;
	public Car(String model, String engine) {
		this.model = model;
		this.engine = engine;
	}
	public Car(String model, String engine, int weight, String color) {
		this.model = model;
		this.engine = engine;
		this.weight = weight;
		this.color = color;
	}
	public Car(String model, String engine, int weight) {
		this.model = model;
		this.engine = engine;
		this.weight = weight;
	}
	public Car(String model, String engine, String color) {
		this.model = model;
		this.engine = engine;
		this.color = color;
	}
	
	public String getEngine() {
		return this.engine;
	}
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
}
