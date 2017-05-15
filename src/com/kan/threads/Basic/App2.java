package com.kan.threads.Basic;

class Worker implements Runnable
{
  
  public void run(){
    
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Thread "+ i);

      try
      {
        Thread.sleep(100);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
  
}

public class App2
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {

    Thread t1 = new Thread(new Worker());
    Thread t2 = new Thread(new Worker());
    
    t1.start();
    t2.start();
  }

}
