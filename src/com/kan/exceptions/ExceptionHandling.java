package com.kan.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class ExceptionHandling {
  
  private static String filepath = "C:\\Users\\TestFiles\\testFile2.txt";
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
      BufferedReader br = null;
      
      
      try{
        
        br = new BufferedReader(new FileReader(filepath));
        System.out.println("Kanhaiya");
            //testException(-5);
            //testException(-10);
            
            
        }catch(FileNotFoundException e){
            //e.getCause();
           // e.printStackTrace();
          System.out.println("Inside Filenotfound");
        }catch(IOException e){
           // e.printStackTrace();
          System.out.println("Inside IO exception");
        }finally{
            System.out.println("Releasing resources");         
        }
      
      System.out.println("Chhipa");
        testException(15);
    }
     
    public static void testException(int i) throws IOException, FileNotFoundException{
      
     // Integer j = null;
      
   //   j.intValue();
      
      if(i < 0){
            FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
           // throw myException;
        }else if(i > 10){
           // throw new IOException("Only supported for index 0 to 10");
        }
        
    }
 
}
