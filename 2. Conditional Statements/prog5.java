//if---else:

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age=ob.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        ob.close();
    }
    
}
