/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
class MyException extends Exception { }
  class Tire {
    void doStuff() {  }
  }
  public class Retread extends Tire {
   public static void main(String[] args) {
     new Retread().doStuff();
    }
  // insert code here
   void doStuff() throws ArithmeticException {
    System.out.println(7/0);
  }
 }
