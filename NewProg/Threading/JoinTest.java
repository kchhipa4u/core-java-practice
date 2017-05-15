/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kc211701
 */
public class JoinTest implements Runnable {
    public static void main(String[] args) {
        Thread a = new Thread(new JoinTest());
        a.start();

        System.out.print("Begin");
        try {
            a.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("End");
    }
    public void run() {
        System.out.print("Run");
    }
}
