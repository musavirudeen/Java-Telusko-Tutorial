//Inner Class:
class A{
    public void showMethod(){
        System.out.println("in A show");
    }
    class B{
        public void showMethod(){
            System.out.println("in B show");
        }
    }
}
public class Prog34 {
    public static void main(String[] args) {
        A obj1= new A();
        obj1.showMethod();

        A.B obj2=obj1.new B();      //Accessing inner class of A
        // A.B obj2 = new A.B();    //if inner class is static
        obj2.showMethod();
    }
}