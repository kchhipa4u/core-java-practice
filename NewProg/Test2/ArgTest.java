/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Test2;

/**
 *
 * @author kc211701
 */
public class ArgTest {

    public static void printValue(int i, int j, int k){
        System.out.println("int");
    }
    public static void printValue(byte...b){
        System.out.println("long");
    }

    public static void main(String... args) {
        byte b = 9;
        printValue(b,b,b);
    }
}
