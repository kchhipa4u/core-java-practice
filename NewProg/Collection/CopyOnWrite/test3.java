/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.CopyOnWrite;

/**
 *
 * @author kc211701
 * Explanation:-

we cannot use iterator method to modify the elements of CopyOnWriteArrayList
 */
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

class test3 {

    public final static void main(String args[]) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add("vivek");
        list.add("kumar");
        Iterator i = list.iterator();
        int j = 0;
        while (i.hasNext()) {
            System.out.println(i.next());
            list.add("abhishek");
            i.remove();
        }
    }
}
