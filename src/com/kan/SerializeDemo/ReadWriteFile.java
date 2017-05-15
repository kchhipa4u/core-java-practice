package com.kan.SerializeDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadWriteFile implements Serializable
{

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception
  {
    Save save = new Save();
    
    File f = new File("kc.txt");
    FileOutputStream fos = new FileOutputStream(f);
   
    ObjectOutputStream oos = new ObjectOutputStream(fos);
   oos.writeObject(save);
   // oos.writeObject(save.i);
   // oos.writeObject(save.aa);
    
    FileInputStream fis = new FileInputStream(f);
     ObjectInputStream dis = new ObjectInputStream(fis);
    //dis.readInt();
   // dis.readUTF();
     Save i = (Save)dis.readObject();
     System.out.println(i.aa);
     
    //System.out.println(dis.readObject().toString());
   // dis.readUTF();
    
   // diss.readInt();
   // diss.readUTF();
  //  System.out.println(save.i);
    

  }

}
