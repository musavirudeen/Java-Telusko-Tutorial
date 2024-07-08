//Comparator vs Comparable:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Student that){
        return this.age<that.age?1:-1;
    }
}

public class Prog55 {
    public static void main(String[] args) {
        // Comparator <Integer> com=new Comparator<Integer>(){
        //     public int compare(Integer i, Integer j){
        //         if(i%10>j%10){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        Comparator<Integer> com=(i,j)->i%10>j%10?1:-1;  //Lambda Expression with ternary operator of above 9 lines of code:
        List<Integer> li=new ArrayList<>();
        li.add(21);
        li.add(43);
        li.add(12);
        li.add(57);

        System.out.println(li);

        li.sort(com);

        for(int i:li){
            System.out.println(i);
        }

        List<Student> stud=new ArrayList<>();

        stud.add(new Student(16, "Mahadhiya"));
        stud.add(new Student(41, "Jafrudeen"));
        stud.add(new Student(40, "Ajimunnisa"));
        stud.add(new Student(20, "Kurshith"));
        stud.add(new Student(22, "Musavirudeen"));
        System.out.println(stud);
        Collections.sort(stud);
        for(Student i:stud){
            System.out.println(i);
        }
    }
}
