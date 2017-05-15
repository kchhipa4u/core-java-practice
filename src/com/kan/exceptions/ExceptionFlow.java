package com.kan.exceptions;


public class ExceptionFlow
{
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    ExceptionFlow ef = new ExceptionFlow();
    ef.method1();
    System.out.println("Main method flow");
  }

  public void method1()
  {
    method2();
    System.out.println("Method1 flow");
  }
  
  public void method2()
  {
    method3();
    System.out.println("Method2 flow");
  }
  
  public void method3()
  {
    try{
    method4();
    }
    catch(ArithmeticException aa){
      //aa.getMessage();
      
      try
      {
        throw new CustomException();
      }
      catch (CustomException e)
      {
        e.customMessage();
        throw new CustomUncheckedException("My Testing");
      }
    }
    System.out.println("Method3 flow");
  }
  
  public void method4()
  {
    
    try{
      
      int x = 5/0;
    }
    catch(ArithmeticException ae){
      ae.getMessage();
      throw new ArithmeticException();
    }
    System.out.println("Method4 flow");
  }
}
