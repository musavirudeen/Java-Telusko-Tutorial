class Human{
    private String name;
    private int age;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}
public class prog22 {
    public static void main(String[] args) {
        Human h1= new Human();
        h1.setname("Dheen");
        h1.setage(22);
        System.out.println("My name is: "+ h1.getname());
        System.out.println("My age is "+ h1.getage());
    }
}
