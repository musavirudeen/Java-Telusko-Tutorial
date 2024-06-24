//Ananymous Inner Class:
class A{
    public void show(){
        System.out.println("in A show..");
    }  
}
public class Prog35 {
    public static void main(String[] args) {
        //the following three lines are representing ananymous inner class.
        A obj =new A(){
            public void show(){
                System.out.println("in new Show....");
            }
        };
        obj.show();
    }
    
}