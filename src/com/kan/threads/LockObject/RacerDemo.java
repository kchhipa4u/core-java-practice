/**
 * 
 */
package com.kan.threads.LockObject;

/**
 * @author kanhaiya.chhipa
 *
 */
public class RacerDemo
{
  /**
   * 
   */
  public RacerDemo()
  {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Racer racer1 = new Racer();
   // Racer racer2 = new Racer();
   // Racer racer3 = new Racer();
    
    
    Thread threadOne = new Thread(racer1, "Kanhaiya");
    Thread threadTwo = new Thread(racer1, "Anita");
    Thread threadThree = new Thread(racer1, "Aanya");
    
    threadOne.start();
    threadTwo.start();
    threadThree.start();
    
    
  }
}
