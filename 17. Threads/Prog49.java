/*
 * Basically, Threads are class of child class of Runnable Interface.
 * so that, we can create runnable variable with the help of thread class. 
 */
class Loop implements Runnable {
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("Hi");
            try{Thread.sleep(10);}
            catch(Exception e){e.printStackTrace();}
        }
    }
}
class Loop2 implements Runnable {
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("Hello");
            try{Thread.sleep(10);}
            catch(Exception e){e.printStackTrace();}
        }
    }
}
public class Prog49 {
    public static void main(String[] args) {
    Runnable o1=new Loop();
    Runnable o2= new Loop2();

    Thread t1 = new Thread(o1);
    Thread t2 = new Thread(o2);
    t2.start();
    t1.start();
    }
}

