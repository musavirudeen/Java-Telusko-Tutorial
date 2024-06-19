//-----------------------------Inheritence Concept--------------------------
class Calc{
    public int add(int m, int n){
        return m+n;
    }
    public int sub(int m, int n){
        return m-n;
    }
}
class AdvCalc extends Calc{             //Single Level Inheritance:
    public int mult(int m, int n){
        return m*n;
    }
    public int div(int m, int n){
        return m/n;
    }
}
class VeryAdvCalc extends AdvCalc{      //Multi Level Inheritance:
    public int power(int m, int n){
        return (int)Math.pow((double)m, (double)n);
    }
}
                         //java doesn't support Multiple Inheritance.
public class Prog27 {
    public static void main(String[] args) {
        Calc ob1= new Calc();
        int r1=ob1.add(8,7);
        System.out.println(r1);

        AdvCalc ob2= new AdvCalc();
        int r2=ob2.mult(3,6);
        System.out.println(r2);
    
        VeryAdvCalc ob3=new VeryAdvCalc();
        int r31=ob3.power(2,8);
        int r32=ob3.add(8,7);
        int r33=ob3.mult(3,6);
        System.out.println(r31+" "+r32+" "+r33);
    }
}
