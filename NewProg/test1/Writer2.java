/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
import java.io.*;

class Writer2 {
  public static void main(String [] args) {
    char[] in = new char[50];           // to store input
    int size = 0;
    try {
      File file = new File(             // just an object
                  "fileWrite2.txt");
      FileWriter fw =
                 new FileWriter(file);  // create an actual file
                                        // & a FileWriter obj
      fw.write("\nKanhaiya Chhipa");       // write characters to
                                        // the file
      fw.flush();                       // flush before closing
      fw.close();                       // close file when done


FileReader fr =
                 new FileReader(file);  // create a FileReader
                                        // object
      size = fr.read(in);               // read the whole file!
      System.out.print(size + " ");     // how many bytes read
      for(char c : in)                  // print the array
        System.out.print(c);
      fr.close();                       // again, always close
    } catch(IOException e) { }
  }
}