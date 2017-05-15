/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author kc211701
 */
public class Fecto {

    public static void main(String a[]) {
        //int i;
        int n = 5;
       
        int u = 1;
        for (int i = 1; i <= n; i++) {


            u = u * i;
            if (i == n) {
                System.out.println("FACTORIAL: " + u);
            }



        }

        if (n==0)
            {
               System.out.println("FACTORIAL: " + (n+1));
            }
    }
}
