/*
 * Enum Constants with parametes....
 */


enum Bikes{
    SPLENDER(80000),PULSAR(180000),DUKE(250000),RE(270000);
    private int price;

    private Bikes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Prog41 {
    public static void main(String[] a){

        for(Bikes bi : Bikes.values())
        {
            System.out.println(bi+" : "+bi.getPrice());
        }
    }
    
}
