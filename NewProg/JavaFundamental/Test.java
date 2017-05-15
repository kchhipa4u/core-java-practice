/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kc211701
 */
public class Test {
    int a = 10;

    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        Test t = new Test();
        String str = "java.util.Collections";
        try {
            Class cls = Class.forName(str);
        Method m[]=cls.getMethods();
        for(int i=0;i<m.length;i++){
            System.out.println("Total Method  " + m[i].toString());
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.doStuff(3);
    }
}
