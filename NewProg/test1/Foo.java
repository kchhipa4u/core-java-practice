/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class Foo {
   


     public static void parse(String str) {
      try {
 float f= Float.parseFloat(str);
 } catch (NumberFormatException nfe) {
  //  f=0;
    System.out.println("ERROR");
 } finally {
 //System.out.println(f);
 }
 }
 public static void main(String a[]){
   parse("Invalid");
  }
}


 class A {

 private int counter = 0;

 public static int getInstanceCount() {
// return counter;
     return 6;
 }

 public A() {
 counter++;
 }

 }