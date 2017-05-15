/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kc211701
 */
interface X{
  public void p();
}
 
class A implements X {

    public void p()
    {}



 public void process() throws Exception { System.out.print("A,"); } }
 class B extends A {
     int a[] = {1,2,3,};
     //List lst = new ArrayList();

     B b = (B) new A();
     A a1 = new B();

 public void process()  {
   int x=0;
     //super.process();
 System.out.print("B,");
 throw new RuntimeException();
 }
 public static void main(String[] args) {
 try {
   A a = new B();
   a.process();
 }
 catch (Exception e) { System.out.println("Exception"); } }

 }