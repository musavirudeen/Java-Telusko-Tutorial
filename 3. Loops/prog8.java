//While Loop

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int i=1;
        int sum=0;
        int n=input.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first ten numbers :"+sum);
        input.close();
    }
}
