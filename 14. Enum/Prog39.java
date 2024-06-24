//Enum:
//  Enum stands for Enumerator, It is only contains constants.
enum Status{
    Success, Pending, Failed, Responding;
}
public class Prog39 {
    public static void main(String[] args) {
        //System.out.println(e1.Success+ e1.Pending+ e1.Failed + e1.Responding);
        for (Status s: Status.values()){
            System.out.println(s + " : " + s.ordinal());
        }
    }    
}
