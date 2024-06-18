class A{
    public A(){
        System.out.println("Object created.");
    }
    public void show(){
        System.out.println("Method Accessed.");
    }
}
public class Porg26{
    public static void main(String[] args) {
        //------------------------------Naming Convention-----------------------------------
        //Class and Interface --> Start with Capital letter eg. Human, Animal, Students
        //variables --> Starts wth small letter eg. sum, num, obj, n1
        //method --> Starts with small letter and end with paranthesis eg. show() , get()
        //Constant --> PIE, DAYS, BRAND
        //Constructor --> Starts with Capital letter and end with paranthesis eg. Human(), Animal()

        //To join two words:
        /* We can use Camel Case to vary two words
         * eg.
         * Class --> SchoolStudents
         * variable --> totalSum, multipleNum, requiredObj
         * method --> showName(), getAge()
         * Constructor -->SchoolStudents()
         * 
         * but, in constant we can seperate two words by adding underscon inbetween two words.
         * eg. MY_DATA, WEEK_DAYS
         */
        //--------------------------------Ananymous Object-------------------------------------
         new A();
         new A().show();
         //An object created without declaring variable for it, is called Ananymous Object.
         //We couldn't reuse the object again.
    }
}