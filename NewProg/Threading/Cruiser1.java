/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author kc211701
 */
public class Cruiser1 {
    private int a = 0;

    public void foo() {
        Runnable r = new LittleCruiser();
        new Thread(r).start();
        new Thread(r).start();
    }

    public static void main(String arg[]) {
        Cruiser1 c = new Cruiser1();
        c.foo();
    }

    public class LittleCruiser implements Runnable {
        public void run() {
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName());
            int current = 0;
            for (int i = 0; i < 4; i++) {
                current = a;
                System.out.print(current + ", ");
                a = current + 2;
            }
            }
        }
    }
}
