class A extends Object  /**In java Every super class exteds Objects class**/
{
    public A(){                     //default super class Constructor
        super(); //default calling method
        System.out.println("in A");
    }
    public A(int n ){
        super();    //default calling method
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){                     //default constructor of child class
        super();    //default calling method
        System.out.println("in B");
    }
    public B(int n){
 //       super(n);   //to access parametrized contructor of super class
        this();
        System.out.println("in B int");
    }
}
public class prog25{
    public static void main(String[] args) {
        B obj = new B(5);
    }
}