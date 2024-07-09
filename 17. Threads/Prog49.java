/*-------------THREADS:------------
        Threads are used to run various task at the same time.
Usually threads always make a method runnable state.
    eg. In games, in the same time we use the no. of players and playing background
bgms also showing other players. those tasks are running on the same time.
those are running with the help of threads.


Threads:-
Multiple threads run at same time in a code.
This is known as Multithreading.

- A thread is a smallest unit to work with. (individual task)
- They can run parallely.
- Multiple threads can share resources.
 * 
 */

 class Loop extends Thread {
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hi");
        }
    }
}
class Loop2 extends Thread {
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hello");
        }
    }
}
public class Prog49{
    public static void main(String[] args) {
        Loop o1=new Loop();
        Loop2 o2 = new Loop2();
        // o1.run();
        // o2.run();        It runs one after one..
        o1.start();
        o2.start();         //Two threads are runs parallelly...
    }
}