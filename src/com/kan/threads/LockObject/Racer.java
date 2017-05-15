/**
 * 
 */
package com.kan.threads.LockObject;

/**
 * @author kanhaiya.chhipa
 *
 */
public class Racer implements Runnable
{
  
  static String winnerName;
  boolean winner;
  /**
   * 
   */
  public Racer()
  {
    
  }
  
  public void raceTrack()
  {
    for(int i=1; i<=10; i++){
     
      if(Racer.winnerName != null)
      {
        break;
      }
         System.out.println(Thread.currentThread().getName() +" is running and has covered " +i+" meter distance");
    // System.out.println(Thread.currentThread().activeCount() +" is state of thread");
     
     if(Racer.winnerName == null && i==10){
       System.out.println("Winner of race is " + Thread.currentThread().getName());
       Racer.winnerName = Thread.currentThread().getName();
       
       break;
     }
      
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    
  }

  @Override
  public void run()
  {
    
    this.raceTrack();
  }
}
