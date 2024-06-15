class Human{
    private int age;
    private String name;
    public Human(){
        System.out.println("Object Created without parameter");
    }
    public Human(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Object Created with parameter");
    }
    public void getDetails(){
        System.out.println(this.name+" "+this.age);
    }
}
public class prog24{
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human("Suhaina",12);
        obj.getDetails();
        obj1.getDetails();
    }
}