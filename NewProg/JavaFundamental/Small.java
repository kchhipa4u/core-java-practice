/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
class Small {
    public Small() {
        System.out.print("a ");
        super();
    }
}

class Small2 extends Small {
    public Small2() {
        System.out.print("b ");
        super();
    }
}

class Small3 extends Small2 {
    public Small3() {
        System.out.print("c ");
        super();
    }
}

public class Test {
    public static void main(String args[]) {
        new Small3();
    }
}
