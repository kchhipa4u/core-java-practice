package com.kan.threads.LockObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*
 * Synchronized method will take approx 5-6 seconds.
 * Synchronized block will take 2-3 secods only
 */
public class LockWorker
{

  List<Integer> list1 = new ArrayList<Integer>();
  List<Integer> list2 = new ArrayList<Integer>();
  
  Object lock1 = new Object();
  Object lock2 = new Object();

  Random random = new Random();

  public void stageOne()
  {
    synchronized (lock1)
    {
      try
      {
        Thread.sleep(1);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
      list1.add(random.nextInt(100));
    }
  }

  public void stageTwo()
  {
    synchronized (lock2)
    {
      try
      {
        Thread.sleep(1);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
      list2.add(random.nextInt(100));
    }
  }

  public  void process()
  {
       for(int i=0; i < 1000; i++)
       {
         stageOne();
         stageTwo();
       }
  }

  /**
   * @param args
   */
  public void main()
  {

    Thread t1 = new Thread(new Runnable()
      {

        public void run()
        {
          process();
        }
      });

    Thread t2 = new Thread(new Runnable()
      {
        public void run()
        {
          process();
        }
      });
    
    long startTime = System.currentTimeMillis();
    t1.start();
    t2.start();
    
    try
    {
      t1.join();
      t2.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

    long endTime = System.currentTimeMillis();
    System.out.println("Total Time " + (endTime-startTime) );
    System.out.println("List1 size " + list1.size() +" ; List2 size "+ list2.size());
  }

}
