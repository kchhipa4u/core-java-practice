/**
 * 
 */
package com.kan.exceptions;

/**
 * @author kanhaiya.chhipa
 * checked exceptions for all errors the application can recover from, and you are allowed to keep continue the execution of your program.
 * e.g. :- Prepare food, switch on fan and see television same time will not interrupt you main execution program of food preparation, but when your
 * gas cylinder get empty (RuntimeExcetion) during your food preparation then you can not recover and your execution will be terminated.
 */
public class CustomException extends Exception
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public void customMessage()
  {
    System.out.println("This is my custom message");
  }
}
