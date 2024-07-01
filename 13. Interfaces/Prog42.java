/*
 * Lambda Expression without return type and parameter:
 */

@FunctionalInterface
interface Sam{
    void show();
    // int sub();
}
public class Prog42{
    public static void main(String[] args) {
        Sam obj=() -> System.out.println("in Show");    //-> Lambda Expression
        obj.show();
    }
}