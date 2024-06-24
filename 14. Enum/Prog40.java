//From Enum getting constant by conditional statement:
enum Status{
    Success, Pending, Failed, Responding;
}
public class Prog40 {
    public static void main(String[] args) {
        Status s = Status.Responding;
        switch (s) {
            case Success:
                System.out.println("Done...");
                break;
            case Pending:
                System.out.println("The process is pending...");
                break;
            case Failed:
                System.out.println("Please Retry..");
                break;
            default:
                System.out.println("Please Wait....");
                break;
        }
        
        if(s==Status.Success){
            System.out.println("Done...");
        }
        else if(s==Status.Pending){
            System.out.println("The process is pending...");
        }
        else if(s==Status.Failed){
            System.out.println("Please Retry..");
        }
        else{
            System.out.println("Please Wait....");
        }
    }
}
