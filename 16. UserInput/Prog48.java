/* Try with resources:
 *      Here try keyword along with resource file, 
 * after finished the try block, then resource file get closed
 * automatically, by the help of try with resource.
 * 
 *      In this programm br.close() runs even we didn't write
 * into our program. 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog48 {
    public static void main(String[] args) throws IOException {
        int num;
        // BufferedReader br=null;
        // try{
        //     br= new BufferedReader(new InputStreamReader(System.in));
        //     num= br.read();
        //     System.out.println("The value is number: "+(num-48));
            
        // }
        // finally{
        //     br.close();
        // }

        try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
            num=br.read();
            System.out.println("The value of number is: "+(num-48));    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
