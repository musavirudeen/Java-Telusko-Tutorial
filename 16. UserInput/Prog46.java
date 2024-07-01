//Buffered Reader Method:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog46{
    public static void main(String[] args)  throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        int num= br.read();
        System.out.println("The value is number: "+(num-48));
        br.close();
    }
}