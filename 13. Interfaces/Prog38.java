//Multi level Interface:
interface Bike{
    int maxSpeed();
    int noOfGears();
}
interface Petrol extends Bike{
    String tankCapacity();
}
class Pulsar150 implements Petrol{
    public int maxSpeed(){
        return 130;
    }
    public int noOfGears(){
        return 5;
    }
    public String tankCapacity(){
        return "15L";
    }
}
public class Prog38 {
    public static void main(String[] args) {
        Pulsar150 bike1=new Pulsar150();
        System.out.println("No of Gears: "+bike1.noOfGears());
        System.out.println("Maximum Spead: "+bike1.maxSpeed());
        System.out.println("Tank Capacity: "+bike1.tankCapacity());  
    }
}
