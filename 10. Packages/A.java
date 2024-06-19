import test.B;

class D extends B{

}
public class A extends B{
    public static void main(String[] args) {
        D obj1=new D();
        System.out.println(obj1.num);
        obj1.show();
    }
}
