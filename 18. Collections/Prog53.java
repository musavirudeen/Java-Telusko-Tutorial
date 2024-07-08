/* Sets:
 *  Sets has Distinct elements. 
 * There are some sets there, which are,
 *      HashSet ->  It used for HashMap
 *      LinkedHashSet   ->  It is stors data, how we put into the set.
 *      TreeSet ->  It is stors data, with sorted type.
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog53 {
    public static void main(String[] args) {
        Set<String> brand=new HashSet<>();
        // Set<String> brand=new LinkedHashSet<>();
        //Set<String> brand=new TreeSet<>();
        brand.add("Samsung");
        brand.add("Realme");
        brand.add("Nothing");
        brand.add("Moto");
        brand.add("OnePlus");
        brand.add("Infinix");
        brand.add("Techno");
        brand.add("Itel");
        brand.add("Lava");
        brand.add("IQOO");
        brand.add("Pixels");
        brand.add("Apple");
        brand.add("Infinix");
        brand.add("Redmi");
        brand.add("Oppo");
        brand.add("Vivo");

        System.out.println(brand);
        // boolean check=false;
        // for(String b: brand){
        //     if(b=="Apple"){
        //         check=true;
        //     }
        // }
        // if(check){
        //     System.out.println("There Apple is a Brand.");
        // }
        brand.remove("IQOO");
        for(String b:brand){
            System.out.println(b);
        }
    }
    
}
