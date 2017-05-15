
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kc211701
 */
public class ExceptionTest1 {

    public int getResult() throws IOException, IllegalArgumentException{

    return 10;
    }

}

class Test11{
    public  void printResult(){
        ExceptionTest1 ext1=new ExceptionTest1();
      try{
        ext1.getResult();
      }
      catch (IOException e2){
      }catch(Exception e){
      }

    }
}