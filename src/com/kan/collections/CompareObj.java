package com.kan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

 class Person implements Comparable<Person>
{
	 String name;

	 
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

public class CompareObj {

	public List<Person> addElements(List<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Kan"));
		col.add(new Person("Shr"));
		col.add(new Person("Nit"));
		col.add(new Person("Sac"));
		col.add(new Person("Ash"));
		
		return col;
	}
	
	public void showElements(List<Person> p)
	{
		System.out.println(p);
	}

	public static void main(String[] a) {
		CompareObj co = new CompareObj();
		List<Person> lst = new ArrayList<Person>();
		
		List<Person> addedList = co.addElements(lst);
		
		Collections.sort(addedList);
		
		co.showElements(addedList);

	}
}
