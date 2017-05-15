/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
class Hotel {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class SuperHotel extends Hotel {
    public void book() {
        bookings--;
    }

    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }

    public static void main(String args[]) {
        SuperHotel hotel = new SuperHotel();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}
