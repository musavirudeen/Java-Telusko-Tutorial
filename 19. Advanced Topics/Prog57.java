/*Stream API:
        Stream class create variable which for dummy variable of Collection interface.
    Because we can have original values, whenever we want to work with it we can use
    stream variable. 
        It only accessed by one time. because, stream is like a water of river, once it
    went from there we can't take the same water which is already passed from there.
*/
import java.util.*;

public class Prog57{
    public static void main(String[] args){
        List<Integer> li=Arrays.asList(3,8,2,5,9);
        
        // new ArrayList<Integer>();
        // li.add(3);
        // li.add(8);
        // li.add(2);
        // li.add(5);
        // li.add(9);

        li.forEach(n-> System.out.println(n));

        /*
        Stream<Integer> s1 = li.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3= s2.map(n->n*2);
        int s4=s3.reduce(0,(c,e)->(c+e));
        System.out.println(s4);
        */

        int result=li.stream()          //Instead of that five line
            .filter(n -> n%2==0)        //we can use this four lines with one stream.
            .map(n -> n*2)
            .reduce(0,(c,e)-> c+e);
        
        System.out.println(result);
    }
}
