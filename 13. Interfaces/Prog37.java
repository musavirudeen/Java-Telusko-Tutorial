/*-------------Interface:-----------------
 * Scenario:
 *      If we want to create object of classes, also we want to combine all the object(classes) under
 * the super class.
 *      
 * In this scenario we can use interface. whenever we want to use interface we don't want to mention
 * it is class.
 */
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, debug, run...");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, debug, run : faster....");
    }
}
class Code{
    public void coding(Computer obj){
        obj.code();
    }
}
public class Prog37 {

    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Code obj = new Code();
        obj.coding(desk);
    }
}
/*interface Book{
    String author();
    int noOfPages();
    String publisher();
    int yearOfPublished();
}
class HowToWinFriendsAndInfluencePeople implements Book{
    public String author(){
        return "Dale Carnegie";
    }
    public int noOfPages(){
        return 234;
    }
    public String publisher(){
        return "Srishti Publishers";
    }
    public int yearOfPublished(){
        return 2020;
    }
}
public class Prog37 {
    public static void main(String[] args) {
        Book object = new HowToWinFriendsAndInfluencePeople();
        System.out.println("Author: \t"+object.author()+"\n"+"No. Of Pages: \t"+object.noOfPages()+"\n"+"Publisher: \t"+object.publisher()+"\n"+"Year of Publishing: \t"+object.yearOfPublished());
    }
    
}*/