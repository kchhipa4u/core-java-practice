/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection.Compre;

import Collection.*;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author kc211701
 */


class Car implements Comparable<Car> {

    String name = null;

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;

    }

    public int compareTo(Car o) {
        return name.compareTo(o.getName());
    }
}
public class SortDemo {

    public static void main(String a[]) {

        Car c1 = new Car("Swift");
        Car c2 = new Car("Maruti");
        Car c3 = new Car("Tata");
        
        ArrayList<Car> list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Collections.sort(list);

        for(Car c : list){
            System.out.println(c.getName());
        }
}

}
