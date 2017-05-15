package com.kan.enumLearning;


/* Shortcoming of java enumeration before 1.5 ENUM
 * 1) No Type-Safety: First of all it’s not type-safe; you can assign any valid int
 *  value to currency e.g. 99 though there is no coin to represent that value.
 *  The compiler won’t complain if you pass other currency to a method that expects
 *  only US currency. 

 2) No Meaningful Printing: printing value of any of these constant will print its
  numeric value instead of meaningful name of coin e.g. when you print NICKLE it
   will print "5" instead of "NICKLE"

3) No namespace: to access the currencyDenom constant we need to prefix class name
 e.g. CurrencyDenom.PENNY instead of just using PENNY though this can also be
  achieved by using static import in JDK 1.5
  
  4) Programs that use the int enum pattern are brittle. Because int enums are
compile-time constants, they are compiled into the clients that use them. If the int
associated with an enum constant is changed, its clients must be recompiled. If
they aren’t, they will still run, but their behavior will be undefined.

5. There is no reliable way to iterate over all the int enum
constants in a group, or even to obtain the size of an int enum group.


 */

public class CurrencyDenom {
  public static final int PENNY = 1;
  public static final int NICKLE = 5;
  public static final int DIME = 10;
  public static final int QUARTER = 25;
}


