/**
 * 
 */
package com.kan.exceptions;

/**
 * @author kanhaiya.chhipa
 * Unchecked exceptions are for all errors from with your application can not recover from.
 */
public class CustomUncheckedException extends RuntimeException
{
  /**
   * 
   */
  private static final long serialVersionUID = 2L;

  public void myRuntimeMetohd()
  {
    System.out.println("I want to test Runtime Custom Exception");
  }

  public CustomUncheckedException(String s)
  {
    super(s);
  }
}
