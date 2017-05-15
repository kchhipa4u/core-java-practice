/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

/**
 *
 * @author kc211701
 */
import java.util.HashSet;

public class HashTest {

    private String str;

    public HashTest(String str) {
        this.str = str;
    }


    @Override
    public String toString() {
        return str;
    }

    @Override
    public int hashCode() {
        return this.str.hashCode();
    }

  // OUTPUT: 3 {size}

    /*@Override
    public boolean equals(Object obj) {
    return this.str.equals(obj);
    }*/



    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HashTest) {
            HashTest ht = (HashTest) obj;
            return this.str.equals(ht.str);
        }
        return false;
    }

  // OUTPUT: 2 {size}

    public static void main(String args[]) {
        HashTest h1 = new HashTest("1");
        HashTest h2 = new HashTest("1");
        String s1 = new String("2");
        String s2 = new String("2");

        if(s1.equals(s2)){
            System.out.println("EQUALS");
        }

        if(s1==s2){
            System.out.println("==");
        }

        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
        hs.add(s1);
        hs.add(s2);

        System.out.print(hs.size());
        System.out.println(hs);
    }
}
