package com.kan.collections;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Set t = new TreeSet();
    List lst = new LinkedList();
    //t.add(null);
     t.add("d");
    // t.add(new StringBuffer("b"));
     t.add("A");
     t.add("B");
     t.add(new Integer(4)); // CCE, as hetrogenious objects are not allowed
    
    // NPE, though null is allowed in treeset but it throws exception because null is only allowed when tree in element or first element of the
    // three else subsequent addition try to compare with existing element and throws exception. when we add null then it should be the only
    // element in the tree
    //t.add(null);
    
    System.out.println(t);
    
  }
}
