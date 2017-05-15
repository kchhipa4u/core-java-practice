/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author kc211701
 */
class A {

    int x = 5;

    public void disp() {
        System.out.println("SUPER");
    }
}

class B extends A {

    int x = 6;
    public void disp() {
        System.out.println("SUB");
    }
}

public class OverrideTest {

    public static void main(String a[]) {
        A obj = new B();
        System.out.println("SUB: " + obj.x);
        obj.disp();
    }
}

