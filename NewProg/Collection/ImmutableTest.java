/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author kc211701
 */
final class MyImmutable {

    private final int[] myArray;

    public MyImmutable(int[] anArray) {
       // this.myArray = anArray; // wrong
        this.myArray = anArray.clone(); // right way
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Numbers are: ");
        for (int i = 0; i < myArray.length; i++) {
            sb.append(myArray[i] + " ");
        }
        return sb.toString();
    }
}

public class ImmutableTest {

    public static void main(String[] args) {
        int[] array = {1, 2};
       
        MyImmutable myImmutableRef = new MyImmutable(array);

       // myImmutableRef = myImmutableRef1;
        System.out.println("Before constructing " + myImmutableRef);
        array[1] = 5; // change (i.e. mutate) the element
        System.out.println("After constructing " + myImmutableRef);
    }
}
