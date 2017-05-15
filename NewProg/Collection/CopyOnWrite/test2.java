/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.CopyOnWrite;

/**
 *
 * @author kc211701
 */
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

class test2 {

    public final static void main(String args[]) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add("vivek");
        list.add("kumar");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            list.add("abhishek");
        }
        System.out.println("After modification:");
        Iterator i2 = list.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}
