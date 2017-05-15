package com.kan.cloning;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
  * Java program to demonstrate copy constructor of Collection provides shallow
  * copy and techniques to deep clone Collection by iterating over them.
  * @author http://javarevisited.blogspot.com
  */
public class CollectionCloningTest {
    //private static final Logger logger = LoggerFactory.getLogger(CollectionCloningTest.class);
  
   
    public static void main(String args[]) {
       
        // deep cloning Collection in Java
        Collection org = new HashSet();
        org.add(new Employee("Joe", "Manager"));
        org.add(new Employee("Tim", "Developer"));
        org.add(new Employee("Frank", "Developer"));
       
        // creating copy of Collection using copy constructor
        //Collection copy = new HashSet(org);
       
        //logger.debug("Original Collection {}", org);
       // logger.debug("Copy of Collection  {}", copy );
       
        Iterator itr = org.iterator();
        while(itr.hasNext()){
            ((Employee) itr.next()).setDesignation("staff");
        }
       
        System.out.println(org);
        System.out.println(copy);
       // logger.debug("Original Collection after modification  {}", org);
        //logger.debug("Copy of Collection without modification {}", copy );
       
        // deep Cloning List in Java
      
    }
  
}

class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, designation );
    }  
   
}



