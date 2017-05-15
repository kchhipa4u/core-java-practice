/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class TestCasting {
    public static void main(String[] args) {
        Vehicle v = new Car();

        // below will give Class cast exception
        //  Bike b = (Bike) v;
        Car c = (Car) v;

        v.printSound();
        c.printSound();
    }
}
