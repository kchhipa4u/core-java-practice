/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author kc211701
 */
public class ClientShape {

    public static void main(String a[]) {

        double dim = 5.0;
        ClientShape cs = new ClientShape();
        List lst = new ArrayList();

        Shape s = new Circle();
        lst.add(s);
         s = new Square();
           lst.add(s);

          double cnt= cs.getTotalArea(lst, dim);

          System.out.println("Total Area: "+cnt);

    
    }

    public  double getTotalArea(List lst, double dim) {
        double totalArea=0.0;
        ListIterator li=lst.listIterator();
        while(li.hasNext()){
              Shape sh=(Shape)li.next();
            totalArea +=  sh.area(dim);
        }
      return totalArea;
    }
}
