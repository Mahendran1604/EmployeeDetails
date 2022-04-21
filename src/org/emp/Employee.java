package org.emp;

public class Employee {
	public void empId(int i) {
		System.out.println(i);
		
	}
	public void empId(String i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(12345);
		e.empId("18EC001,18EC002");
		
		
	}

}
