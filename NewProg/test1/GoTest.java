/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */


interface Base {
 boolean m1 ();
 byte m2(short s);
 }
public class GoTest implements Base {

    public boolean m1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public byte m2(short s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
