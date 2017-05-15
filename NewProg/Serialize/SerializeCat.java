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

class Cat implements Serializable {
    String name="Tomcat";
} // 1
public class SerializeCat {

    public static void main(String[] args) {
        Cat c = new Cat(); // 2
        try {
            FileOutputStream fs = new FileOutputStream("testSer.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(c); // 3
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
         Cat  c1 = (Cat) ois.readObject(); // 4
            System.out.println(c1.toString());
            System.out.println(c1.name);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}