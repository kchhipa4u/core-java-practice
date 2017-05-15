package com.kan.cloning;

public class Testcloning
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    

    Empp emp1 = new Empp("Mike", 100);
    
    Empp emp2 = null;
    try
    {
       emp2 = (Empp) emp1.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    
    System.out.println(emp1);
    
    System.out.println(emp2);
    
    System.out.println(emp1.equals(emp2));
    
    System.out.println(emp1.name);
    System.out.println(emp2.name);
    
    emp1.setName("GGG");
    
    System.out.println(emp1.name);
    System.out.println(emp2.name);
    
  }

}
