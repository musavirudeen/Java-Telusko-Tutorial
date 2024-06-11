class Computer{
    public void PlayVideo(){
        System.out.println("Playing Video.....");
    }
    public int GetMeAMouse(int num){
        if(num>100){
            System.out.println("Your Mouse here sir....");
            int bal=num-100;
            return bal;
        }
        else{
            System.out.println("you don't have cash to buy mouse....");
            return 0;
        }
    }
}
public class prog12 {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.PlayVideo();
        int buy=obj.GetMeAMouse(150);
        System.out.println("Your Balance is here sir....."+buy);
    }
}