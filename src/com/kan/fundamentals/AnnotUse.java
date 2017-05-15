package com.kan.fundamentals;

class Abc
{
	public void disp()
	{
		System.out.println("KKK");
	}
}


public class AnnotUse extends Abc {

	@Override
	public void disp()
	{ 
		Runtime.getRuntime().
		System.out.println("CCC");
		Teacher.std.addStudents();
	}
	
	public static void main(String a[])
	{
		AnnotUse aa = new AnnotUse();
		aa.disp();
	}
}
