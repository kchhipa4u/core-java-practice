/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

/**
 *
 * @author kc211701
 */
public class TestInterface implements P,Q {

    public static void main(String a[]) {
      TestInterface ti = new TestInterface();
      P obj = new TestInterface();
      System.out.println("Output:" + obj.i);
      ti.f();
      System.out.println("Output:" + Q.i);
    }

    public void f() {
        System.out.println("INTERFACE");
    }
}
