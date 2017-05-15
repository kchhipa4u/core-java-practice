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

public class TryQueue {
    public static void main(String args[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("3");
        q.add("1");
        q.add("2");

        System.out.println(q);


        System.out.print(q.poll() + " ");
        System.out.print(q.peek() + " ");
        System.out.print(q.peek());
    }
}
