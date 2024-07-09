/*Thread Priority and Sleep:
        It helps to get priority to the threads.
 * 
 */

class Loop extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
                sleep(10);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Loop2 extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                sleep(10);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Prog50{
    public static void main(String[] args) {
        Loop o1=new Loop();
        Loop2 o2 = new Loop2();

        o1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(o2.getPriority());
        System.out.println(o1.getPriority());
        
        o1.start();
        try{
            o1.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        o2.start();         
   }
}