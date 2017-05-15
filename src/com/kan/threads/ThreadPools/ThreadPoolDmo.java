package com.kan.threads.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Process implements Runnable{

  int id;
  
  public Process(int id){
    id = this.id;
  }

  public void run()
  {
    System.out.println("Process starting... " + id);
    
    try
    {
      Thread.sleep(4000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println("Process completed... " + id);
  }
  
}

public class ThreadPoolDmo
{

  public static void main(String[] args)
  {

    ExecutorService serivce = Executors.newFixedThreadPool(2);
    
    for(int i=0; i < 5; i++){
      serivce.submit(new Process(i));
    }
    
    serivce.shutdown();
    
    System.out.println("All tasks are submitted...");
    
    try
    {
      serivce.awaitTermination(1, TimeUnit.HOURS);
    }
    catch (InterruptedException e){
    }
    
    System.out.println("All tasks are completed...");
  }

}
