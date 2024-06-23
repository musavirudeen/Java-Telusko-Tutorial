//Run time polymorphism with the help of Dynamic Method Dispatch:
//It's also kind of method overridding
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}
public class Prog30 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj= (A)new B();   //also its' upcasting
        obj.show();

        obj =(A) new C();
        obj.show();
    }
    
}
