package com.kan.exceptions;

/*
 * This class is an example of Exception type error.
 * It will throw StackOverflowError when we will try to run this program.
 */
public class ErrorTest
{
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    ErrorTest et = new ErrorTest();
    et.methodA();
  }
  
  public void methodA(){
    methodB();
  }
  public void methodB(){
    methodA();
  }

}
