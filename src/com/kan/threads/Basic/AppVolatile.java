package com.kan.threads.Basic;

import java.util.Scanner;


class Processor extends Thread{
  
  private volatile
  boolean running = true;

  public void run()
  {
    while (running)
    {

      System.out.println("Hi");
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
  
  public void shutdown(){
    running = false;
  }
}

public class AppVolatile
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Processor proc1 = new Processor();
    proc1.start();
    
    Scanner scn = new Scanner(System.in);
    scn.nextLine();
    proc1.shutdown();
    
  }

}
