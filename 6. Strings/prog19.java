public class prog19 {
    public static void main(String[] args) {
        String name="Dheen";
        name="Musaviru"+name;
        System.out.println(name);
        
        String n1= "musavirudeen";
        String n2="musavirudeen";
        //The above two variable have same address of String Constant Pool.
        System.out.println(n1.equals(n2));
        System.out.println(name.equals(n2));
    }    
}
