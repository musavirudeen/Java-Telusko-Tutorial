class DeenException extends Exception{
    public DeenException(String str){
        super(str);
    }
}
public class Prog45 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try {
            j=18/i;
            if(j==0)
                throw new DeenException("Length is not worked on null...");
        } 
        catch(DeenException e){
            System.out.println("Name is empty...."+e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        finally{
            System.out.println("out side of try-catch block");
        }
    }
}
