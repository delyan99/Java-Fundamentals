package CompanyRoster_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		List<Employee> employees = new ArrayList<>();
		List<Employee> bestEmployees = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			String[] input = scan.nextLine().split("\\s+");
			String name = input[0];
			double salary = Double.parseDouble(input[1]);
			String position = input[2];
			String department = input[3];
			if(input.length == 5) {
				if(input[4].contains("@")) {
					String email = input[4];
					Employee employee = new Employee(name, salary, position, department, email);
					employees.add(employee);
				}else {
					int age = Integer.parseInt(input[4]);
					Employee employee = new Employee(name, salary, position, department, age);
					employees.add(employee);
				}
			}else if(input.length == 6) {
				if(input[4].contains("@")) {
					String email = input[4];
					int age = Integer.parseInt(input[5]);
					Employee employee = new Employee(name, salary, position, department, email, age);
					employees.add(employee);
				}else {
					String email = input[5];
					int age = Integer.parseInt(input[4]);
					Employee employee = new Employee(name, salary, position, department, email, age);
					employees.add(employee);
				}
			}else {
				Employee employee = new Employee(name, salary, position, department);
				employees.add(employee);
			}
			
		}
		double salary = 0; 
		String department = "";
		for (Employee employee : employees) {
			String curentDepartment = employee.getDepartment();
			double curentSalary = 0;
			int departmentCounter = 0;
			boolean flag = true;
			for (Employee employee2 : employees) {
				if(curentDepartment.equals(employee2.getDepartment())) {
					curentSalary += employee2.getSalary();
					departmentCounter++;
					flag = false;
				}
			}
			
			double curSalary = employee.getSalary();
			if(flag) {
				curSalary = employee.getSalary();
			}else {
				curSalary = curentSalary/departmentCounter;
			}
			if(curSalary > salary) {
				salary = curSalary;
				curSalary = employee.getSalary();
				department = employee.getDepartment();
				bestEmployees.removeAll(bestEmployees);
				for (Employee employee2 : employees) {
					if(employee2.getDepartment().equals(employee.getDepartment())) {
						bestEmployees.add(employee2);
					}
				}
				
			}
		}
		System.out.printf("Highest Average Salary: %s%n", department);
		bestEmployees.stream()
		.sorted((e1, e2) -> Double.compare(e2.getSalary() , e1.getSalary()))
		.forEach(e -> System.out.println(e.toString()));
		
	}

}
