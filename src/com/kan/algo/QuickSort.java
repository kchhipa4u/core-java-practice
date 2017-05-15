package com.kan.algo;

public class QuickSort
{

  static int a[]={ 1, 4, 9, 6, 3, 8, 2, 5, 7};
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    QuickSort qs = new QuickSort();
    
   for (int arr : a)
  {
    System.out.print(arr);
  } 
   int pivatVal = a[a.length - 1];
   for(int x=0; x< a.length; x++) {
     if(a[x] > pivatVal){
       
       swap()
     }
   }
      
  }

  @Override
  public String toString()
  {
    return "QuickSort [toString()=" + a.toString() + "]";
  }
  
  

}
