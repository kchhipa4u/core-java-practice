/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Enum;

/**
 *
 * @author kc211701
 */
public enum MyEnumSingleton {
INSTANCE(15,"Safe Singlton");
   private int length;
   private String name;
   private MyEnumSingleton(int length, String name){
       this.length=length;
       this.name=name;

   }

   public int getLength() {
       return length;
   }

   public String getName() {
       return name;
   }

   public static MyEnumSingleton getINSTANCE() {
       return INSTANCE;
   }

   public static void main(String a[]){
      MyEnumSingleton mes = MyEnumSingleton.getINSTANCE();
      mes.length=5;
       System.out.println(mes.length);
   }
}
