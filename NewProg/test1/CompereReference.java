/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */
import javax.swing.JButton;
class CompereReference {
  enum Color {RED, BLUE}                   // ; is optional
  public static void main(String[] args) {
     Color c1 = Color.RED; Color c2 = Color.BLUE;
     if(c1 == c2) { System.out.println("= ="); }
     if(c1.equals(c2)) { System.out.println("dot equals"); }
}
}