package CarSalesman_03;

public class Engine {
	private String model;
	private int power;
	private int displacement;
	private String efficiency;
	public Engine(String model, int power, int displacement, String efficiency) {
		this.model = model;
		this.power = power;
		this.displacement = displacement;
		this.efficiency = efficiency;
	}
	public Engine(String model, int power, int displacement) {
		this.model = model;
		this.power = power;
		this.displacement = displacement;
	}
	public Engine(String model, int power, String efficiency) {
		this.model = model;
		this.power = power;
		this.efficiency = efficiency;
	}
	public Engine(String model, int power) {
		this.model = model;
		this.power = power;
	}
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getPower() {
		return this.power;
	}
	public int getDisplacement() {
		return this.displacement;
	}
	
	public String getEfficiency() {
		return this.efficiency;
	}
	
	public void setEfficiency(String efficiency) {
		this.efficiency = efficiency;
	}
	
}
