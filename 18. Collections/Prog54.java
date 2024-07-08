/* Maps:
 *  Maps has keys along with values.
 * It has three types.
 * there are , HashMap  ->  It is primarily used for data speed.
 *              TreeMap ->  It is Sorted key values.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prog54 {
    public static void main(String[] args) {
        // Map<Integer,String> employers=new HashMap<>();
        Map<Integer,String> employers=new TreeMap<>();
        employers.put(1001, "Dheen");
        employers.put(1005, "Jailani");
        employers.put(1003, "Yusuf");
        employers.put(1002, "Jafar");
        employers.put(1004, "Abdul");
        System.out.println(employers);
        System.out.println(employers.keySet());
        for (int k : employers.keySet()) { 
            System.out.println(employers.get(k));
        }
    }
    
}
