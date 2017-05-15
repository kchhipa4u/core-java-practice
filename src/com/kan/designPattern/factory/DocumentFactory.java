/**
 * There are multiple Design patterns used in this example
 * 1. Factory Design pattern :- Creational pattern
 * 2. Singleton Design pattern
 * 3. Design to interface
 * 4. Reflection API also used to create an object of one of the Document class.
 */
package com.kan.designPattern.factory;

/**
 * @author kanhaiya.chhipa
 *
 */
public class DocumentFactory
{
 
  private static DocumentFactory docFactory = new DocumentFactory();
  
  /**
   * 
   */
  public DocumentFactory()
  {
    
  }
  
  public IDocument createDocumetFactory(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    if(type.equals("TEXT")){
       //return  new TextDocument(); 
      return (IDocument) Class.forName("com.kan.designPattern.factory.TextDocument").newInstance();
    }
    else if(type.equals("SPREAD")){
      return  new SpreadsheetDocument();
    }
    else{
    return null;
    }
  }
  
  
  public static DocumentFactory getDocumentFactory(){
    return docFactory;
    
  }
}
