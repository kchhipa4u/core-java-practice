/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author kc211701
 */
public class SerializeDog {

    public static void main(String[] args) {
        Collar c = new Collar(3);
        Dog d = new Dog(c, 8);

        System.out.println("before: collar size is " + d.getCollar().getCollarSize());
        try {
            FileOutputStream fs = new FileOutputStream("Test.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) {
        }


        

        try {
            FileInputStream fis = new FileInputStream("Test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d1 = (Dog) ois.readObject(); // 4
            System.out.println(d1.toString());
            System.out.println(d1.getCollar());
            System.out.println(d1.volt);
            System.out.println("after: collar size is " + d1.getCollar().getCollarSize());

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
