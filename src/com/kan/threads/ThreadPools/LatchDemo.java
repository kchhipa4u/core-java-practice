package com.kan.threads.ThreadPools;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Proc implements Runnable{

  CountDownLatch latch;
  
  public Proc(CountDownLatch latch){
    latch = this.latch;
  }
  
  public void run()
  {
    System.out.println("Starting...");
    try
    {
      Thread.sleep(3000);
    }
    catch (InterruptedException e){
    }
    latch.countDown();
  }
  
}


public class LatchDemo
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {

    CountDownLatch latch = new CountDownLatch(3);
    
    ExecutorService execute = Executors.newFixedThreadPool(3);
    
    for(int i=0; i <3; i++){
      execute.submit(new Proc(latch));
    }
    
    try
    {
      latch.await();
    }
    catch (InterruptedException e)
    {
    }
    
    System.out.println("Done....");
  }

}
