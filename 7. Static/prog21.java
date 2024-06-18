public class prog21 {
    static String name;
    String brand;
    int price;
    public void view(){
        System.out.println(name+" "+brand+" "+price);
    }
    static void MyStaticmethod(){
        System.out.println("Static accessed..");
    }
    public void MyPublicMethod(){
        System.out.println("Public method Acessed...");
    }
    public static void main(String[] args) {
        prog21 m1=new prog21();
        m1.brand="Samsung";
        m1.price=30000;
        prog21.name="Smart Phone";

        prog21 m2=new prog21();
        m2.brand="RealMe";
        m2.price=25000;

        m1.view();
        m2.view();

        MyStaticmethod();
        prog21 object=new prog21();
        object.MyPublicMethod();
    }    
}

