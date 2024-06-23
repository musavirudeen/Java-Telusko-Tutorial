class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  Prog32{
    public static void main(String[] args) {

//    	double d=4.5;	
//    	int i=(int)d;			//typecasting
//    	
//    	System.out.println(i);
    	
		A obj1= new A();
		obj1=(A)new B();   //Upcasting
		obj1.show1();
		
    	B obj2=(B)obj1;	  //Downcasting
    	obj2.show2();
    }
}