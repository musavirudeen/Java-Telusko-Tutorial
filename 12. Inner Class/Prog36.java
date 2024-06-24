//Abstract Ananymous Inner Class:
abstract class Car{
    public abstract void drive();
    public abstract void noOfGears();
    public void playSound(){
        System.out.println("Playing sound....");
    }
}
public class Prog36 {
    public static void main(String[] args) {
        Car obj = new Car(){        //Ananymous Innerclass with override of abstract methods.
            public void drive(){
                System.out.println("Driving....");
            }
            public void noOfGears(){
                System.out.println("5 gears without Reverse.");
            }
        };
        obj.drive();
        obj.noOfGears();
        obj.playSound();
    }
    
}
