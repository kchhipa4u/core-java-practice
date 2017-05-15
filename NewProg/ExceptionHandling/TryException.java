/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;

/**
 *
 * @author kc211701
 */
class A {
    public void doA() {
        B b = new B();
        b.dobB();
        System.out.print("doA");
    }
}

class B {
    public void dobB() {
        C c = new C();
        c.doC();
        System.out.print("doB");
    }
}

class C {
    public void doC() {
        if (true)
            throw new NullPointerException();
        System.out.print("doC");
    }
}

public class TryException {

    public static void main(String args[]) {
        try {
            A a = new A();
            a.doA();
        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
