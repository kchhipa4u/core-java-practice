/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection.Compre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author kc211701
 */

class User implements Comparable<User>{
    String firstName;
    String lastName;
//User1 u = new User1();
// Constructor

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }


//  Getter, Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   

    public int compareTo(User o) {
                      //User o=(User)o1;
       
        int x = this.firstName.compareTo(o.getFirstName());

        if(x==0){
            return this.lastName.compareTo(o.getLastName());
        }

        return x;
    }
}
public class ComparableTest {
    public static void main(String a[]) {
        User u1 = new User("Kan","Mohan");
        User u2 = new User("Kan", "Chhipa");
        User u3 = new User("Amit", "Mohan");

        List<User> lst = new ArrayList<User>();
        lst.add(u1);
        lst.add(u2);
        lst.add(u3);
        Collections.sort(lst);
        for(User u : lst){
            System.out.println("First Name: " + u.getFirstName() + " "+ "Last Name: " + u.getLastName());
        }
    }

}
