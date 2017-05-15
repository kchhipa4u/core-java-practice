/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class Boxer1 {

    
     //String str = "420";
    //str += 42;
  //   str = str+42;
          int a = 10;

    public void doStuff(int a) {
        a += 1;
        System.out.println(a++);
    }
    public static void main(String args[]) {
        Boxer1 t = new Boxer1();
        t.doStuff(3);
    }
}
