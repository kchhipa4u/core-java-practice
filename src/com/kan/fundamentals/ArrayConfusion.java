package com.kan.fundamentals;

public class ArrayConfusion
{
  
 
  public static void printArray(int [] temp)
  {
    temp[3] =5;
    for (int i : temp)
    {
      System.out.println("inside printArray " +i); 
    }
    
  }
  
  public static void main(String a[])
  {
    int arr[]=new int [4];
    
    arr[0] =1;
    arr[1] =2;
    arr[2] =3;
    arr[3] =4;
    
    for (int i : arr)
    {
      System.out.println("Inside main before printArray " + i);
    }
    
    printArray(arr);
    
    for (int i : arr)
    {
      System.out.println("Inside main before printArray " + i);
    }
    
  }


}
