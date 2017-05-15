/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */

import static JavaFundamental.XYZ.*;
interface XYZ{
    int x=5;
}


public class ImportInterface {
    public static void main(String args[]) {
        int z = 2*x;
        System.out.println("JJJ  "+ z);
    }

}
