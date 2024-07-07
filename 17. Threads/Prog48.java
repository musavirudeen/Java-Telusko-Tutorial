/*-------------THREADS:------------
        Threads are used to run various task at the same time.
Usually threads always make a method runnable state.
    eg. In games, in the same time we use the no. of players and playing background
bgms also showing other players. those tasks are running on the same time.
those are running with the help of threads.
 * 
 */

class Loop extends Thread {
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("Hi");
            try{Thread.sleep(30);}
            catch(Exception e){e.printStackTrace();}
        }
    }
}
class Loop2 extends Thread {
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("Hello");
            try{Thread.sleep(30);}
            catch(Exception e){e.printStackTrace();}
        }
    }
}
public class Prog48{
    public static void main(String[] args) {
        Loop o1=new Loop();
        Loop2 o2 = new Loop2();
        o1.start();
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        o2.start();
    }
}