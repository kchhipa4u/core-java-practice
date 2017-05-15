*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Test2;

/**
 *
 * @author kc211701
 */
public class Important {

    public static void main(String[] args) {
        int i1= 140;
        Integer i2=140;

        if(i1==i2){
            System.out.println("i1==i2");
        }


        String s1 = new String("abc");
        String s2 = new String("bcd");
        s1=s2;
        
        if(s1.equals(s2))
        {
            System.out.println("s1==s2");
        }
        Integer i3=140;
        Integer i4=140;
        if(i3==i4){
            System.out.println("i1==i2");
        }
        else{
            System.out.println("Not EQUAL");
        }

        int i5=140;
        Integer i6=140;

        if(i5==i6){
            System.out.println("i5==i6");
        }
        else{
            System.out.println("Not EQUAL");
        }

       Integer i7=new Integer(10);
       Integer i8=new Integer(10);
       if(i7.equals(i8))
       {
           System.out.println("i7equalsi8");
       }

       if(i7==i8){
            System.out.println("i7==i8");
        }
       
        else{
            System.out.println("Not EQUAL");
        }

    }

}
