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

class test1 {

    public final static void main(String args[]) {
        List list = new ArrayList();
        list.add("vivek");
        list.add("kumar");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            list.add("abhishek");
        }
    }
}