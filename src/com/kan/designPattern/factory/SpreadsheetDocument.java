/**
 * 
 */
package com.kan.designPattern.factory;

/**
 * @author kanhaiya.chhipa
 *
 */
public class SpreadsheetDocument implements IDocument
{
  /**
   * 
   */
  public SpreadsheetDocument()
  {
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public void save()
  {
    System.out.println("spreadsheet doc saved");
  }

  @Override
  public void edit()
  {
    System.out.println("spreadsheet doc edited");
  }

  @Override
  public void delete()
  {
    System.out.println("spreadsheet doc deleted");
  }
}
