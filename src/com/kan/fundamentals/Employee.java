package com.kan.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String firstName;
	String lastName;
	String age;
	private Employee employee;
	
	public List<Employee> addEmployees()
	{
		Employee emp1 = new Employee();
		
		employee = new Employee();
		
                
                
		emp1.setAge("10");
		emp1.setFirstName("FirStu");
		emp1.setLastName("lastStu");
		
		Employee emp2 = new Employee();
		emp2.setAge("10");
		emp2.setFirstName("SecStu");
		emp2.setLastName("SecStuLast");
		
		Employee emp3 = new Employee();
		emp3.setAge("10");
		emp3.setFirstName("ThiStu");
		emp3.setLastName("ThiStuLast");
		
		Employee emp4 = new Employee();
		emp4.setAge("10");
		emp4.setFirstName("FourStu");
		emp4.setLastName("FourStuLast");
		
	    List<Employee> students = new ArrayList<Employee>();
	    students.add(emp1);
	    students.add(emp2);
	    students.add(emp3);
	    students.add(emp4);

		return students;
	}
	
	

	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAge() {
		return age;
	}




	public void setAge(String age) {
		this.age = age;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
