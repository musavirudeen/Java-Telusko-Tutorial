class Calculator{
    int num=5;
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class prog14 {
    public static void main(String[] args) {
        int data =10;
        Calculator obj= new Calculator();
        Calculator obj1=new Calculator();
        int r1=obj.add(3, 4);
        int r2=obj.add(9,4);
        obj.num=8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
    
}
