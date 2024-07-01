//From Enum getting constant by conditional statement:
enum Status{
    SUCCESS, PENDING, FAILED, RESPONDING;
}
public class Prog40 {
    public static void main(String[] args) {
        Status s = Status.RESPONDING;
        switch (s) {
            case SUCCESS:
                System.out.println("Done...");
                break;
            case PENDING:
                System.out.println("The process is pending...");
                break;
            case FAILED:
                System.out.println("Please Retry..");
                break;
            default:
                System.out.println("Please Wait....");
                break;
        }

        s=Status.FAILED;
        
        if(s==Status.SUCCESS){
            System.out.println("Done...");
        }
        else if(s==Status.PENDING){
            System.out.println("The process is pending...");
        }
        else if(s==Status.FAILED){
            System.out.println("Please Retry..");
        }
        else{
            System.out.println("Please Wait....");
        }
    }
}
