/*
 * Run time Errors are called Exceptions.
 * Handling Run time errors is called as Exceptional Handling.
 */
public class Prog44 {
    public static void main(String[] args) {
        int i=2,j=0;
        int[] nums={2,3,4,5,6};
        String name=null;
        int len;
        try {
            j=18/i;
            //nums[5]=7;
            //len=name.length();
        }
        catch(ArithmeticException e){
            System.out.println("Dinominator not be zero....");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are crossed the limit...");
        }
        catch(NullPointerException e){
            System.out.println("Name is empty....");
        }
        catch (Exception e) {
            System.out.println("Exception occured....."+e);
        }
        System.out.println("value of j :"+j);
        System.out.println("Outer of Try catch:");
    }
}