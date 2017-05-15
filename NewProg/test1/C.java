/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class C {

     static void test() {
    int r=0;
   System.out.print(r);
         try {
 String x=null;
 System.out.print(x.toString() + " ");
 }
 finally { System.out.print("finally"); }
 }
 public static void main(String[] args) {
 try { test(); }
 catch (Exception ex) { System.out.print("exception"); }
 }
}
