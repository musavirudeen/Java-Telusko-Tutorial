class Employee{
    int id;
    String name;
    int age;
    float salary;
}
public class prog19 {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.id=1001;
        e1.name="Avinesh";
        e1.age=27;
        e1.salary=30_000f;

        Employee e2=new Employee();
        e2.id=1002;
        e2.name="Bagiran";
        e2.age=35;
        e2.salary=60_000f;
        
        Employee e3=new Employee();
        e3.id=1003;
        e3.name="Chandesh";
        e3.age=28;
        e3.salary=33_000f;

        // Employee[] employees=new Employee[3];
        // employees[0]=e1;
        // employees[1]=e2;
        // employees[2]=e3;
        Employee[] employees={e1,e2,e3};

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i].id+" "+ employees[i].name+" "+employees[i].age+" "+ employees[i].salary);
        }
        for(Employee n:employees){
            System.out.println(n.id+" "+n.age+" "+n.name+" "+n.salary);
        }
    }    
}
