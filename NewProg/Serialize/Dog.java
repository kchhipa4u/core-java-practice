/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialize;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author kc211701
 */
public class Dog implements Serializable {

    transient private Collar theCollar;
    private int dogSize;
    public volatile int volt=200;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar() {
        return theCollar;
    }

    private void writeObject(ObjectOutputStream os) {
// throws IOException { // 1
        try {
            os.defaultWriteObject(); // 2
            os.writeInt(theCollar.getCollarSize()); // 3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
// throws IOException, ClassNotFoundException { // 4
        try {
            is.defaultReadObject(); // 5
            theCollar = new Collar(is.readInt()); // 6
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
