/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

import java.util.HashSet;


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

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object objCar) {

        Car cr = (Car) objCar;
        return getName().equals(cr.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }




}
public class HashSetDemo {

    public static void main(String a[]) {

        Car c1 = new Car("Swift");
        Car c2 = new Car("Maruti");
        Car c3 = new Car("Tata");
        Car c4 = new Car("Maruti");

        HashSet<String> hs = new HashSet<String> ();
        String s1 = new String("AAA");
        String s2 = new String("BBB");
        String s3 = new String("CCC");

       hs.add(s1);
       hs.add(s2);
       hs.add(s1);
       hs.add(s3);
   System.out.println("Before looo"+hs);
       for(String str : hs)
       {
           System.out.println(str);
       }


      HashSet<Car> hs1 = new HashSet<Car> ();

      hs1.add(c1);
      hs1.add(c2);
      hs1.add(c1);
      hs1.add(c3);
      hs1.add(c4);



      System.out.println("Before looo"+hs1);
        for(Car str1 : hs1)
       {
           System.out.println(str1.getName());
       }
        
    }

}
