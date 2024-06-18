public class prog13 {
    static int add(int n1,int n2){
        return n1+n2;
    }
    static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static void main(String[] args) {
        int sum=add(23,78);
        int sum1=add(13, 23, 98);
        System.out.println(sum+" "+sum1);
    }
}