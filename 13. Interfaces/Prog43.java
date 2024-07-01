/*
 * Lambda Expression with return and parameters:
*/
@FunctionalInterface
interface Calci {
    int add(int i,int j);    
}
public class Prog43{
    public static void main(String[] args) {
        Calci obj= (i,j)->i+j;      //Lambda Expression:
        int result=obj.add(7,8);
        System.out.println(result);
    }
}
