/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

import java.util.HashSet;

/**
 *
 * @author kc211701
 */
class Bean{
    private String str;

    Bean(String str ){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public boolean equals(Object o){
        if (!(o instanceof Bean)) {
            return false;
        }

        return ((Bean) o).getStr().equals(str);
    }

    public int hashCode() {
        return 12345;
    }

    public String toString() {
        return str;
    }
}




public class HashSetTeat {
    public static void main(String ... sss) {
        HashSet myMap = new HashSet();
        String s1 = new String("das");
        String s2 = new String("das");
        Bean s3 = new Bean("abcdef");
        Bean s4 = new Bean("abcdef");

        myMap.add(s1);
        myMap.add(s2);
        myMap.add(s3);
        myMap.add(s4);

        System.out.println(myMap);
    }
}
