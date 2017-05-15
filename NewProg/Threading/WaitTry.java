/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author kc211701
 */
class SomeClass{
    
}

public class WaitTry {

    public void waitForSomething() {
        SomeClass o = new SomeClass();
        synchronized (o) {
            o.wait();
            o.notify();
        }
    }
    public static void main(String arg[]) {
        
    }

}
