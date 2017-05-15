package com.kan.datastructure;


class LinkList {
  private Link firstLink;
  
  LinkList(){
    firstLink = null;
  }
  
  public boolean isEmpty(){
    return (firstLink == null);
  }
  
  
  public void insertFirstLink(String name, int age){
    Link newLink = new Link(name, age);
    newLink.next = firstLink;
    firstLink = newLink;
  }
}

public class Link
{
  private String personName;
  private int age;
  
   Link next;

    public Link(String personName, int age)
  {
    super();
    this.personName = personName;
    this.age = age;
  }


    public static void main(String[] args)
  {
    
           List l = new LinkList();
  }

}
