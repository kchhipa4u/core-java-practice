package com.kan.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student student = new Student();
		List<Student> studs = student.addStudents();
		
		Employee emp = new Employee();
		List<Employee> emps = emp.addEmployees();
		
		System.out.println(studs.equals(emps));
		studs.equals(emps);
		
		
		
		System.out.println(studs);
		
		
	}
}
