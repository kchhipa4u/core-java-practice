package com.kan.threads.Basic;

import java.util.concurrent.atomic.AtomicInteger;



public class AppSynchronize
{

  // Address the issue using AtomicInteger
  /*private AtomicInteger counter = new AtomicInteger(0);
  
  public void increment(){
    counter.incrementAndGet();
  }*/
  
  private int counter =0;
  
  public synchronized void increment(){
    counter++;
  }
  /**
   * @param args
   */
  public static void main(String[] args)
  {
     AppSynchronize as = new AppSynchronize();
     as.doWork();
  }

  public void doWork()
  {
    Thread a1 = new Thread(new Runnable()
      {
        public void run()
        {
          for(int i=0; i<10000; i++){
            
            increment();
          }
        }
      });
    
    Thread a2 = new Thread(new Runnable()
    {
      public void run()
      {
        for(int i=0; i<10000; i++){
          
          increment();
        }
      }
    });
    
    a1.start();
    a2.start();
    
    try
    {
      a1.join();
      a2.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    
    System.out.println("Counter Val "+ counter);
  }

}
