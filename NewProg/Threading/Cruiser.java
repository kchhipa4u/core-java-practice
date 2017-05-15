/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author kc211701
 */
public class Cruiser implements Runnable {

    public void run() {
        System.out.print("go");
    }

    public static void main(String arg[]) {
        
        Thread t = new Thread(new Cruiser());
        System.out.println("TEST:" + t.isAlive());
        t.run();
        t.run();
        t.start();
        System.out.println("TEST:" + t.isAlive());
    }
}
