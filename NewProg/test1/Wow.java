/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class Wow {


       public static void go(short n) {System.out.println("short"); }
       public static void go(Short n) {System.out.println("SHORT");}
       public static void go(Long n) {System.out.println("LONG"); }
       public static void go(Integer n) {System.out.println("INTEGER"); }
       public static void main(String [] args) {
       Short y= 6;
        int z=7;
 go(y);
 go(z);

 }


}
