/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author kc211701
 */
class Car {

    String name = null;

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;

    }
}

public class ArrayListDemo {

    public static void main(String a[]) {

        Car c1 = new Car("Swift");
        Car c2 = new Car("Maruti");
        Car c3 = new Car("Tata");

            /*ArrayList<Car> list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);*/

        /*TreeSet<Car> list = new TreeSet<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);*/


// TreSet is used for sorted list
        TreeSet<String> tr = new TreeSet<String>();
        tr.add("CCC");
        tr.add("JJJ");
        tr.add("AAA");
        tr.add("DDD");

        for (String l : tr) {
            System.out.println(l);
        }

// ArrayList is ordered
        final ArrayList<String> arr = new ArrayList<String>();
        arr.add("CCC");
        arr.add("JJJ");
        arr.add("AAA");
        arr.add("DDD");

        arr.add(2, "BBB");
        //arr.set(2, "BBB");

        System.out.println(arr);
        Collections.sort(arr);

      
      

        



        System.out.println("Sorted ArrayList");

     for (String ar : arr) {
            System.out.println(ar);
        }

     // Arrays as list

     String[] myArray = {"Java", "J2EE", "XML", "JNDI"};
     System.out.println(Arrays.asList(myArray));

    }
}
