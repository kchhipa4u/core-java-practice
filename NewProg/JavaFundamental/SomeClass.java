/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
public class SomeClass {
    private Integer value = 1;

    public Integer getValue() {
        return value;
    }

    public void changeVal(Integer value) {
        value = new Integer(3);
    }

    public static void main(String args[]) {
        Integer a = new Integer(2);
        SomeClass c = new SomeClass();
        c.changeVal(a);
        System.out.print(a);
    }
}
