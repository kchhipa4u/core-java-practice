/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */



    

public class StaticTest {
    static int i;
    




    public static void disp(){
        final int i =0;
        System.out.println("INside static method.." + i);
        
    }
    

    static{
        System.out.println("INside static BLOCK..");
    }
public static void main(String[] args) {
    System.out.println("Kanhaiya"+StaticTest.i);
}

}
