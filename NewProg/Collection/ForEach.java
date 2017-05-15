/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kc211701
 */
public class ForEach {
    public static void main(String args[]) {

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        Integer i3 = new Integer(3);
        List<Integer> lst = new ArrayList<Integer>();
         lst.add(i1);
         lst.add(i2);
         lst.add(i3);

         for(Integer in : lst){
             System.out.println("Integer: " + in);
         }

    }

}
