/**
 * 
 */
package com.kan.StringDemo;

import java.util.Scanner;

/**
 * @author kanhaiya.chhipa
 *
 */
public class ReverseStringTest
{
  
      
      
      StringBuilder revStr = new StringBuilder();
      /**
       * 
       */
      public ReverseStringTest()
      {
      }
    
      /**
       * @param args
       */
      public static void main(String[] args)
      {
        String test;
        Scanner in = new Scanner(args[0]);
        test = in.nextLine();
        System.out.println(test);
        String s = test;
        
        ReverseStringTest rst = new ReverseStringTest();
         rst.simepleReverse(s);
         rst.usingStringBuilder(s);
      }
      
      public StringBuilder simepleReverse(String s)
      {
        for(int i = s.length()-1;  i>=0 ; i--)
        {
            char ch =  s.charAt(i);
            
            revStr = revStr.append(ch); 
        }
       
        System.out.println(revStr);
        return revStr;
        
      }
      
      public void usingStringBuilder(String s)
      {
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Using Stringbuilder API " + sb.reverse());
      }
}
