/*---------Abstraction-------------
 * Data Abstraction is the process of hiding certain details and showing only 
 * necessary information to the user.
 * 
 * Abstract class:
 *      It is arestricted class tjat can't be used to create objects.
 * If we want to access it, it must be inherited by another class.
 * 
 * Abstract method:
 *      It can only be used in abstract class. and it doesn't have body.
 * The body is provided by the subclass.
 */

abstract class Animal{
    public abstract void soundOfAnimal();
    public void sleepingSound(){
        System.out.println("Zzz....");
    }
}
class Monkey extends Animal{
    public void soundOfAnimal() {
        System.out.println("krr.. krr...");
    }
}
public class Prog33 {
    public static void main(String[] args) {
        Animal obj= new Monkey();
        obj.sleepingSound();
        obj.soundOfAnimal();
    }
}
