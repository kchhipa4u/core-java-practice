/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
public class TestString3 {

        public static void main(String[] args) {
        // insert code here

            StringBuilder s = new StringBuilder("123456789");
          System.out.println(s.delete(0,3));
          System.out.println(s.delete( 1 ,3));
          System.out.println(s.delete(2,5));
          System.out.println(s.insert( 1, "24"));
         // s.delete(0,3).delete( 1 ,3).delete(2,5).insert( 1, "24");
       System.out.println(s);
 }
}
