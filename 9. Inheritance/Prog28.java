
//-------------------------Method Overriding-------------------------------
class B{
    public void show(){
        System.out.println("Show in B");
    }
    public void config(){
        System.out.println("Config in B");
    }
}
class C extends B{
    public void show(){             //overriding the method of super class
        System.out.println("Show in C");
    }
}
public class Prog28 {
    public static void main(String[] args) {
        C object = new C();
        object.show();
        object.config();
    }
}
