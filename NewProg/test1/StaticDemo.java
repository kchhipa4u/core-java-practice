/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
class A{
    public static void A(){
        System.out.println("Static Method");
    }
}

class B extends A{
 public static void A(){
     System.out.println("Overriden");
 }
}


public class StaticDemo {
    
    public static void main(String[] args) {
        A b = new B();
        b.A();

    }
}


