/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */

class Test_If {
  public static void main(String [] args) {
    boolean isTrue = true;
x:
  for(int i=0; i<5; i++) {
    while (isTrue) {


System.out.println("Hello");
    break x;
  } // end of inner while loop
  System.out.println("Outer loop."); // Won't print
  } // end of outer for loop
System.out.println("Good-Bye");
}

  



}
