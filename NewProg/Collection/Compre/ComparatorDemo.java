/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Compre;

import Collection.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author kc211701
 */
class Car {

    String name = null;
    Integer id=0;

    

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Car(String name, Integer id) {
        this.name = name;
        this.id=id;

    }

    /*public int compareTo(Car o) {
    return name.compareTo(o.getName());
    }*/
}
public class ComparatorDemo {
 
    public static void main(String a[]) {

        Car c1 = new Car("Swift",new Integer(3));
        Car c2 = new Car("Maruti",new Integer(1));
        Car c3 = new Car("Tata",new Integer(2));

       // sort by name

        class NameCompare implements Comparator<Car> {

            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

      // sort by id
class IdCompare implements Comparator<Car> {

        public int compare(Car o1, Car o2) {
           return o1.getId().compareTo(o2.getId());
        }
        }


  ArrayList<Car> list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        NameCompare nc = new NameCompare();
      IdCompare ic = new IdCompare();

      Collections.sort(list,nc);
      System.out.println("Sort by Name:");
        for (Car c : list) {
            System.out.println("Name: "+ c.getName() +"  "+ "ID: "+ c.getId());
        }

       Collections.sort(list,ic);
       System.out.println("Sort by ID:");
        for (Car c : list) {
        System.out.println("Name: "+ c.getName() +"  "+ "ID: "+ c.getId());
        }

    }
}
