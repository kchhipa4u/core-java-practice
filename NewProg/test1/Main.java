/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
      int a = 10;

    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        Main t = new Main();
        t.doStuff(3);
    }

}
