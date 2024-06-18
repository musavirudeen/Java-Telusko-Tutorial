class Students{
    int rollno;
    String name;
    int percentage;
}
public class prog18 {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.rollno=1001;
        s1.name="Sarvesh";
        s1.percentage=80;

        Students s2=new Students();
        s2.rollno=1002;
        s2.name="Abinesh";
        s2.percentage=68;

        Students s3=new Students();
        s3.rollno=1003;
        s3.name="Ragul";
        s3.percentage=93;

        Students[] student= new Students[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(int i=0;i<student.length;i++){
            System.out.println(student[i].rollno+" "+student[i].name+" "+student[i].percentage);
        }
        for(Students n: student){
            System.out.println(n.rollno+" "+n.name+" "+n.percentage);
        }
    }
}
