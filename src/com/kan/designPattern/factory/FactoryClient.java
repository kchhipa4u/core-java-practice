/**
 * 
 */
package com.kan.designPattern.factory;

/**
 * @author kanhaiya.chhipa
 *
 */
public class FactoryClient
{
  /**
   * 
   */
  public FactoryClient()
  {
    
  }

  /**
   * @param args
   * @throws ClassNotFoundException 
   * @throws IllegalAccessException 
   * @throws InstantiationException 
   */
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
  {
    DocumentFactory  docFactory = DocumentFactory.getDocumentFactory();
   
    IDocument textDoc = docFactory.createDocumetFactory("TEXT");
    textDoc.save();
    
    IDocument spreadDoc = docFactory.createDocumetFactory("SPREAD");
    spreadDoc.delete();
  }
}
