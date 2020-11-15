package RawData_02;

public class Car {
	private String model;
	private Engine engine;
	private Cargo cargo;
	private Tire1 tire1;
	private Tire2 tire2;
	private Tire3 tire3;
	private Tire4 tire4;
	
	public Car(String model, int engineSpeed,int enginePower, int cargoWeight, String cargoType, double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
		engine = new Engine();
		cargo = new Cargo();
		tire1 = new Tire1();
		tire2 = new Tire2();
		tire3 = new Tire3();
		tire4 = new Tire4();
		this.model = model;
		this.engine.setEngineSpeed(engineSpeed);
		this.engine.setEnginePower(enginePower);
		this.cargo.setCargoWeight(cargoWeight);
		this.cargo.setCargoType(cargoType);
		this.tire1.setPressure(tire1Pressure);
		this.tire1.setAge(tire1Age);
		this.tire2.setPressure(tire2Pressure);
		this.tire2.setAge(tire2Age);
		this.tire3.setPressure(tire3Pressure);
		this.tire3.setAge(tire3Age);
		this.tire4.setPressure(tire4Pressure);
		this.tire4.setAge(tire4Age);
	}
	public String getCargoType() {
		return this.cargo.getCargoType();
	}
	
	public double getTire1() {
		return tire1.getPressure();
	}
	
	public double getTire2() {
		return tire1.getPressure();
	}
	
	public double getTire3() {
		return tire1.getPressure();
	}
	
	public double getTire4() {
		return tire1.getPressure();
	}
	
	public int getEnginePower() {
		return this.engine.getEnginePower();
	}
	
	@Override
	public String toString() {
		return this.model;
	}
	
}