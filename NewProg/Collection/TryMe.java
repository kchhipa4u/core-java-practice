/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

/**
 *
 * @author kc211701
 */
import java.util.Collections;
import java.util.LinkedList;

public class TryMe {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("BbB1");
        list.add("bBb2");
        list.add("bbB3");
        list.add("BBb4");
        Collections.sort(list);
        for (String str : list) {
            System.out.print(str + ":");
        }
    }
}
