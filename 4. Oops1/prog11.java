//package Oops1;
import java.util.Scanner;
class Calculator {
    public int add(int n1, int n2){
        int r= n1 + n2;
        return r;
    }
}
public class prog11{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=input.nextInt();
        System.out.println("Enter number 2: ");
        int num2=input.nextInt();
        Calculator calc=new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
        input.close();
    }
}