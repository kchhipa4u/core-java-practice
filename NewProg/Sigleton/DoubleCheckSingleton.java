/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sigleton;

/**
 *
 Weak Singleton, reason given below:
 
 You would expect Line 7 to be atomic, but in fact you can break this up into

7.1 mem = allocateMemory();       //Allocate memory for Singleton object.
7.2 instance = mem;               //Note that instance is now non-null, but has not been initialized.
7.3 ctorSingleton(instance);      //Invoke constructor for Singleton passing instance.

In a multithread environment, you can guess what would happen after one thread loses its time slice after
 * executing Line 7.2

 The other explanation that I heard was that the compiler would get ’smart’ and realize that
 * there was nothing really useful between Lines 3 and 6 and nothing changed the value of the
 * instance variable in between, and so it would ‘optimize’ the code by taking out Line 6 and combining
 * it with Line 3. In Debug mode, it wouldn’t ‘optimize’ this and it worked like a charm.
 */

class SomeClass {
  private volatile static SomeClass helper = null;
    public static SomeClass getHelper() {
        if (helper == null) {
            synchronized(SomeClass.class) {
                if (helper == null) {
                    helper = new SomeClass();
                }
            }
        }
        return helper;
    }
}


public class DoubleCheckSingleton {

    public static void main(String[] args) {
        System.out.println("Singleton" + SomeClass.getHelper().toString());
    }

}
