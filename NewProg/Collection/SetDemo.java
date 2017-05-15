/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author kc211701
 */
public class SetDemo {

    public static void main(String a[]) {

        
        Set<String> hs = new LinkedHashSet<String>();
        String s1 = new String("AAA");
        String s2 = new String("BBB");
        String s3 = new String("CCC");
        String s4 = new String("DDD");
        String s5 = new String("EEE");

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        System.out.println("Before Linked HashSet");

        System.out.println(hs);

Set<String> lhs = new LinkedHashSet(hs);


System.out.println("AFTER Linked HashSet");

        System.out.println(lhs);


    }
}
