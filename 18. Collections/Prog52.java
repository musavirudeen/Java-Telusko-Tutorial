/*List:
 * ArrayList and LinkedList:
 * usually LinkedList is faster than ArrayList. and more precicable when we use sort method.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Prog52 {
    public static void main(String[] args) {
        // List<String> name=new LinkedList<>();
        List<String> name=new ArrayList<>();
        name.add("Salfan");
        name.add("Nasrudeen");
        name.add("Riyasudeen");
        name.add("Saraf");
        name.add("Saraf");
        name.add("Sareef");
        name.add("Siraj");
        name.add("Musavirudeen");

        System.out.println(name);
        name.sort(null);
        for(String n: name){
            System.out.println(n);
        }
    }
}
