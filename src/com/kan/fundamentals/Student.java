package com.kan.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String firstName;
	String lastName;
	String age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Student> addStudents()
	{
		Student stud1 = new Student();
		stud1.setAge("10");
		stud1.setFirstName("FirStu");
		stud1.setLastName("lastStu");
		
		Student stud2 = new Student();
		stud2.setAge("10");
		stud2.setFirstName("SecStu");
		stud2.setLastName("SecStuLast");
		
		Student stud3 = new Student();
		stud3.setAge("10");
		stud3.setFirstName("ThiStu");
		stud3.setLastName("ThiStuLast");
		
		Student stud4 = new Student();
		stud4.setAge("10");
		stud4.setFirstName("FourStuNew");
		stud4.setLastName("FourStuLastNew");
		
	    List<Student> students = new ArrayList<Student>();
	    students.add(stud1);
	    students.add(stud2);
	    students.add(stud3);
	    students.add(stud3);

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
