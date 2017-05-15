/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StringDemo;

/**
 *
 * @author kc211701
 */
public class StringToken {

    public static void main(String args[]) {
        String test = "This is a test string";
        String[] tokens = test.split("/s");
        System.out.println(tokens.length);

        String s1 = new String("abc");
        String s2 = s1;//new String("abc");
        System.out.println("KAN: " + s1==s2);
     //   s1=s2;

        System.out.println("KAN: " + s1==s2);

    }
}
