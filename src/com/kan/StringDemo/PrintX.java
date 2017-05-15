package com.kan.StringDemo;

import java.util.Scanner;

public class PrintX
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    int a=0;
    
    Scanner s = new Scanner(args[0]);
    a = s.nextInt();
    int i,j;
    int count=0;
    for(i=0; i<=a; i++){
      for(j=0; j < i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
