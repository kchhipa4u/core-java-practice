/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaFundamental;

/**
 *
 * @author kc211701
 */
public class ReferenceDemo {
    private int roomNr;

    public ReferenceDemo(int roomNr) {
        this.roomNr = roomNr;
    }

    public int getRoomNr() {
        return this.roomNr;
    }

    static ReferenceDemo doStuff(ReferenceDemo hotel) {
        hotel = new ReferenceDemo(1);
        return hotel;
    }

    public static void main(String args[]) {
        ReferenceDemo h1 = new ReferenceDemo(100);
        System.out.print(h1.getRoomNr() + " ");
        ReferenceDemo h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }
}
