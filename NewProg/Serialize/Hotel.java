/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Serialize;

/**
 *
 * @author kc211701
 */
import java.io.*;

public class Hotel implements Serializable {
    private Room room = new Room();

    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room implements Serializable {
}
