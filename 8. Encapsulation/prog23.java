class Animal{
    String name;
    public Animal(){
        this.name="Animal";
    }
}
class Human extends Animal{
    private int age;
    private String name;
    
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
    //public void setName(String name, Human object){
    //    Human obj1=object;
    //    obj1.name=name;
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return this.name;
    }
    public void getsuperName(){
        System.out.println(super.name);              //super is used to access the variables of parent class
    }
}
public class prog23{
    public static void main(String[] args) {
        Human object = new Human();
        object.setName("Salfan");
        object.setAge(9);
        object.getsuperName();
        System.out.println(object.getName()+" "+object.getAge());
    }
}