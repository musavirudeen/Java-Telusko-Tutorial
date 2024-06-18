public class prog20 {
    public static void main(String[] args) {
        StringBuilder name= new StringBuilder("Mohamed");
        name= name.append(" Musavirudeen");
        System.out.println(name);
        name=name.delete(0, 8);
        System.out.println(name); 
    }    
}
