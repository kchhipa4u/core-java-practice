/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
public class SomeClass1 {
    private int value = 1;

    public int getValue() {
        return value;
    }

    public void changeVal(int value) {
        value = value;
    }

    public static void main(String args[]) {
        int a = 2;
        SomeClass1 c = new SomeClass1();
        c.changeVal(a);
        System.out.print(c.getValue());
    }
}
