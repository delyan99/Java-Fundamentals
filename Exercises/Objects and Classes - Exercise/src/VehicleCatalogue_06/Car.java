package VehicleCatalogue_06;

public class Car {
	private String model;
	private String color;
	private int hoursepower;
	
	public Car(String model, String color, int hoursepower) {
		this.model = model;
		this.color = color;
		this.hoursepower = hoursepower;
	}
	
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getHoursepower() {
		return this.hoursepower;
	}
	
	@Override
	public String toString() {
		return String.format("Model: %s%nColor: %s%nHorsepower: %d", this.getModel(), this.getColor(), this.getHoursepower());
	}
}
