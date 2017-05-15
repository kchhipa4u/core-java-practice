/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Compre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author kc211701
 */
class Dog {

    String dName;
    int dAge;

    Dog(String dName, int dAge) {
        this.dName = dName;
        this.dAge = dAge;
    }

    public int getDAge() {
        return dAge;
    }

    public void setDAge(int dAge) {
        this.dAge = dAge;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

}

    class Cat {

        String cName;
        int cAge;

        public Cat(String cName, int cAge) {
            this.cName = cName;
            this.cAge = cAge;
        }

        public int getCAge() {
            return cAge;
        }

        public void setCAge(int cAge) {
            this.cAge = cAge;
        }

        public String getCName() {
            return cName;
        }

        public void setCName(String cName) {
            this.cName = cName;
        }
    }

    class ComparatorDogCat implements Comparator {

        public int compare(Object o1, Object o2) {
            Dog d = (Dog) o1;
            Cat c = (Cat) o2;
            return d.getDName().compareTo(c.getCName());
        }
    }

    public class ComparatorTest{
        public static void main(String a[]) {
            Dog d1 = new Dog("DDD", 5);
            Cat c1 = new Cat("DDD", 5);
            Dog d2 = new Dog("AAA", 7);
            Cat c2 = new Cat("CCC", 4);

            List lst = new ArrayList();
            lst.add(d1);
            lst.add(c1);
            lst.add(d2);
            lst.add(c2);
            
            ComparatorDogCat cdc = new ComparatorDogCat();



            Collections.sort(lst,cdc);

           
        }
    }
   
 