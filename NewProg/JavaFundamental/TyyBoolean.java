/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
public class TyyBoolean
{

    public static void printB(String str) {
         System.out.print(Boolean.valueOf(str) ? "true" : "false");
    }

    public static void main(String args[]) {
        printB("tRuE");
        printB("false");
    }
}
