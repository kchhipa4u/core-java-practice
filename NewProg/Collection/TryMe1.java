/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

/**
 *
 * @author kc211701
 */
import java.util.*;

class Empty {
}

class Extended extends Empty {
}

public class TryMe1 {
        public static void doStuff1(List<Empty> list) {
                // some code
            System.out.println("1");
        }
        public static void doStuff2(List list) {
                // some code
            System.out.println("2");
        }
        public static void doStuff3(List<? extends Empty> list) {
                // some code
            System.out.println("3");
        }

        public static void main(String args[]) {
                List<Empty> list1 = new LinkedList<Empty>();
                List<Extended> list2 = new LinkedList<Extended>();

                // more code here
                doStuff1(list1);
                doStuff2(list2);
                doStuff2(list1);
                doStuff3(list1);
                doStuff3(list2);
                doStuff3(list2);
        }
}
