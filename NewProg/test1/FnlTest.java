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
    public final void g(){
        System.out.println("KANHAIYA");
    }
}

class B extends A{

   
    public final void g(int x){
        System.out.println("KANHAIYA");
    }
  
}

public class FnlTest {

    public static void main (String a[]){
      B b1 = new B();
     b1.g();
  }
}
