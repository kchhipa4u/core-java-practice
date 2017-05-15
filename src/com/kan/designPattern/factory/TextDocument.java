/**
 * 
 */
package com.kan.designPattern.factory;

/**
 * @author kanhaiya.chhipa
 * 
 */
public class TextDocument implements IDocument
{
  /**
   * 
   */
  public TextDocument()
  {
  }

  @Override
  public void save()
  {
    System.out.println("Text doc saved");
  }

  @Override
  public void edit()
  {
    System.out.println("Text doc edited");
  }

  @Override
  public void delete()
  {
    System.out.println("Text doc deleted");
  }
}
