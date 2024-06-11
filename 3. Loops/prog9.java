import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        int i=1;
        int mul=1;
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        do{
            mul*=i;
            i++;
        }while(i<=num);
        System.out.println("The multiply of first ten number: "+mul);
        n.close();
    }
    
}
