/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */

import java.util.*;
public class Testing1 {

      public static Collection get() {
 Collection sorted = new LinkedList();
   sorted.add("B"); 
   sorted.add("C"); 
   sorted.add("A");
 return sorted;
 }



   /*     public static Iterator reverse(List list) {
 Collections.reverse(list);
 return list.iterator();
 }*/
 public static void main(String[] args) {
// List list = new ArrayList();
// list.add("1");
// list.add("2");
// list.add("3");
// for(Object obj: reverse(list))
     for (Object obj: get())
 System.out.print(obj + ",");

 }
   
      



}
