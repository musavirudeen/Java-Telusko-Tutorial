import test.B;
public class A extends B{
    // public void accessVar(){
    //     System.out.println(this.num);
    //     this.show();
    // }
    public static void main(String[] args){
        A obj = new A();
        // obj.accessVar(); 
        System.out.println(obj.num);
        obj.show();
    }
    //--------------Run in Traditional-------------
}
