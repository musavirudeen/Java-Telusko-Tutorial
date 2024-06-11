//Type Conversion , Casting and Promotion:

public class prog4 {
    public static void main(String[] args) {
        byte b=127;
        int a=b;                //type conversion
        System.out.println(a);
        
        int c=257;
        byte d=(byte)c;         //type casting
        System.out.println(d);

        int e=12;
        byte f=(byte)e;         //type casting
        System.out.println(f);

        float g=12.6f;
        int h=(int)g;           //type casting
        System.out.println(h);

        byte i=12;
        byte j=30;
        int k=i*j;              //type promotion
        System.out.println(k);
    }  
}
