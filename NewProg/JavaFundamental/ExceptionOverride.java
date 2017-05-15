/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
class Hotel {
    public void book() throws Exception {
        throw new Exception();
    }
}

public class ExceptionOverride extends Hotel  {
    public void book() throws Exception {
        System.out.print("booked");
    }

    public static void main(String args[]) throws Exception {
        Hotel h = new ExceptionOverride();

        h.book();
    }
}
