public class Prog31 {
    public static void main(String[] args) {
        final int days=7;
        System.out.println(days);
        //days=8;    it would be false because we created days variable by using the keyword of final.
        A obj= new A();
        obj.Method();
    }
}
final class A{  //we won't create child class for this class
    public final void Method(){     // we won't override this method from child class.
        System.out.println("A method");
    }
}
// class B extends A{
//     // public void Method(){
//     //     System.out.println("B method");
//     // }
// }