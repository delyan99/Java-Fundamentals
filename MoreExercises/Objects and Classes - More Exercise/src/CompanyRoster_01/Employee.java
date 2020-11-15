package CompanyRoster_01;

public class Employee {
	private String name;
	private double salary;
	private String position;
	private String department;
	private String email = "n/a";
	private int age;
	
	public Employee(String name, double salary, String position, String department) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
	}
	public Employee(String name, double salary, String position, String department, String email, int age) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.email = email;
		this.age = age;
	}
	public Employee(String name, double salary, String position, String department, String email) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.email = email;
	}
	
	public Employee(String name, double salary, String position, String department, int age) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	@Override
	public String toString() {
		if(this.age == 0) {
			this.age = -1;
		}
		return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
	}
	
}
