package com.kan.threads.Basic;

class Runner1 implements Runnable {
  
  @Override
  public void run() {
      for(int i=0; i<5; i++) {
          System.out.println("Hello: " + i);
           
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
      }
       
  }
   
}


public class Application1 {

   
  public static void main(String[] args) {
      Thread thread1 = new Thread(new Runner1());
      thread1.start();
  }

}
