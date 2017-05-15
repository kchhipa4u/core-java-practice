
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kc211701
 */
public class RecursionTest {

    public int fun(int i, int j) {

        if (j == 0) {
            return 0;
        } else {
            return i + fun(i, j - 1);
        }



    }

    public static void main(String a[]) {


        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(istream);
        RecursionTest rt = new RecursionTest();


        try {


            System.out.println("Please Enter First digit: ");
            String fir = bufRead.readLine();



            System.out.println("Please Enter Second Digit: ");
            String sec = bufRead.readLine();


            int x = Integer.parseInt(fir);
            int y = Integer.parseInt(sec);

            int z = rt.fun(x, y);

            System.out.println("MUL:" + z);


        } catch (IOException err) {

            System.out.println("Error reading line");

        } catch (NumberFormatException err) {

            System.out.println("Error Converting Number");
        }

    }
}
