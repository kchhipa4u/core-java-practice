/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
public class TrickyNum<X extends Number> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private double getDouble() {
        return x.doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}
