/*
 * --------synchronized Keyword-------------
 *      It is used for prevent data lose when we use same method via 
 * two threads. if method is declared with the keyword of synchronized
 * then it only accessed after one thread to another.
 */
class Counting{
    int num=0;
    public synchronized void increment(){
        num++;
    }
}
public class Prog50 {
    public static void main(String[] args) throws InterruptedException {
 
        Counting c = new Counting();
 
        Runnable ob1= () ->
        { 
            for(int i=0;i<100000;i++){ 
                c.increment();
            }
        };

        Runnable ob2=() ->
        {
            for(int j=0;j<100000;j++){
                c.increment();
            }
        };

        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);

        t1.start();
        t2.start();    
        
        t1.join();
        t2.join();

        System.out.println(c.num);
    }    
}
