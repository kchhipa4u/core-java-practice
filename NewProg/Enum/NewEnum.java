/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Enum;

/**
 *
 * @author kc211701
 */
public enum NewEnum {
RECTANGLE, CIRCLE, LINE;
        public static void main (String a[]){
           NewEnum ne = NewEnum.CIRCLE;
            System.out.println("KAN" + ne);

            for(NewEnum sh : NewEnum.values()){
                System.out.println(sh);
                System.out.println(sh.ordinal());
            }
}
}
