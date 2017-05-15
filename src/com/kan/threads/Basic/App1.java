package com.kan.threads.Basic;

class MyThread extends Thread
{
  public void run()
  {
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

public class App1
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {

    MyThread r1 = new MyThread();
    MyThread r2 = new MyThread();
    
    r1.start();
    r2.start();
  }

}
