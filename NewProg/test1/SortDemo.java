/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author kc211701
 */
public class SortDemo {

    public static void main(String a[]) {
        int[] arr = {20, 12, 21, 32, 16, 13};
        int[] arr1 = new int[6];
        System.out.println("Array Leangth: " + arr.length);

        for (int i = 0; i < arr.length; i++) {

            for (int u = 0; u <arr.length; u++) {

                if (arr[u] > arr[u + 1]) {
                    arr1[u] = arr[u + 1];
                    arr1[u + 1] = arr[u];
                 //   System.out.print(arr[u]);
                 //   System.out.print(arr[u + 1]);
                } else {
                    arr1[u] = arr[u];
                    arr1[u + 1] = arr[u + 1];
                  //  System.out.print(arr[u]);
                  //  System.out.print(arr[u + 1]);
                    

                }


            }
            System.out.println(arr1[i]);


        }


    }
}
