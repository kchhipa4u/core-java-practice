/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
class Hotel1 {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class Good extends Hotel1 {
    public void book() {
        bookings--;
    }

    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }

    public static void main(String args[]) {
        Hotel1 hotel = new Good();
        hotel1.book(2);
        System.out.print(hotel.bookings);
    }
}
