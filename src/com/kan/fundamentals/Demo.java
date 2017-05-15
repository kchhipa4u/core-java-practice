package com.kan.fundamentals;

class Vehicle
{
  public static void kmToMiles(int km)
  {
    System.out.println("Inside parent class' static method");
  }
}

class Car extends Vehicle
{
  public static void kmToMiles(int km)
  {
    System.out.println("Inside Child class' static method");
  }
}

public class Demo
{
  public static void main(String args[])
  {
    Vehicle v = new Car();
    v.kmToMiles(10);
  }
}