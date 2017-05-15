package com.kan.cloning;


class Subject {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String s) {
    name = s;
  }

  public Subject(String s) {
    name = s;
  }
}

public class Empp implements Cloneable
{

  Subject subj;
  int salary;

 
  public Empp(Subject subj, int salary)
  {
      this.subj = subj;
      this.salary = salary;
  }


  public Empp()
  {
    super();
  }

  
  @Override
  public String toString()
  {
    return super.toString();
  }


  protected Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }



  public Subject getSubj()
  {
    return subj;
  }


  public void setSubj(Subject subj)
  {
    this.subj = subj;
  }


  public int getSalary()
  {
    return salary;
  }


  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  
 

}
