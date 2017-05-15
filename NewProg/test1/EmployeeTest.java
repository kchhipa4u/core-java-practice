/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author kc211701
 */

class Person {
 String name = "No name";

 public Person()
 {}
 public Person(String nm) { name = nm; }
 }

 class Employee extends Person {
 String emplD = "0000";
 public Employee(String id) { 
     super("Kan");
     emplD = id;

    }
 }

 public class EmployeeTest {
 public static void main(String[] args) {
 Employee e = new Employee("4321");
 //System.out.println(e.empID);
 System.out.println(e.emplD);
 }
 }