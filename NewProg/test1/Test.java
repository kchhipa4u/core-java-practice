/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Test {
    public static void main(String... args) {

        Set s = new TreeSet();
         s.add("7");
         s.add(9);
         Iterator itr = s.iterator();
         while (itr.hasNext())
         System.out.print(itr.next() + " ");



    }

}
