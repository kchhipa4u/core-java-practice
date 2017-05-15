/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author kc211701
 */
class JoinTestTh implements Runnable {
  public void run() {

      for(int i=0; i<100; i++){
          System.out.println("i="+i);
      }
      for(int i=0; i<100; i++){
          System.out.println("i="+i);
      }
  }
}
public class ThreadExercise {
    public static void main(String[] args) throws Exception {
        Thread a = new Thread(new JoinTestTh());
        a.setDaemon(true);
        a.start();

        for(int i=0; i<5; i++){
          }
        System.out.println("Exited");
    }
}


