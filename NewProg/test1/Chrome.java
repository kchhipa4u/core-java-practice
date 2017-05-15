/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */

class X { void do1() { } }
class Y extends X { void do2() { } }


public class Chrome {
   
    int t=5;
    int a[] = {1,2,3};


    int x[] = new int[5];
   Chrome c1 = new Chrome();

void display()
{
    
//  System.out.println(c1.a[0]);
//  System.out.println(a.length);
}

public static void main(String[] args) {
          int[] anArray;              // declares an array of integers

          anArray = new int[10];
          anArray[0]=100;
          anArray[1]=200;


    X x1 = new X();
    X x2 = new Y();
    Y y1 = new Y();
    Chrome c = new Chrome();
  
   System.out.println(anArray[0]);
   System.out.print(c.a[1]);
   System.out.print(c.a[2]);

    
}

}
