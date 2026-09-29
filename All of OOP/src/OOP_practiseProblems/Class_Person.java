package OOP_practiseProblems;

import javax.naming.Name;
import java.security.PrivateKey;

public class Class_Person {
    private String Name;
    private int age;
   public  Class_Person(String Name,int age)//Constructorfunc can have public, or I can just simply don't put
    {
        this.Name=Name;
        this.age=age;
    }

    String getName()
    {
        return Name;
    }
    int getAge()
    {
        return age;
    }
    void setAge(int age) // Setter Methods
    {                    // Helps to Modify values from main function;
        this.age=age;
    }
    void setName(String Name)
    {
        this.Name=Name;
    }
    public static void main(String[] args)
    {
        Class_Person P1=new Class_Person("Adel",23);
        Class_Person P2=new Class_Person("Arup",21);
        System.out.println(P1.Name+" is "+P1.age+" years old");
        System.out.println(P2.getName()+" Is "+P2.getAge()+" Years Old");
        P1.setName("Saidur");
        P1.setAge(20);
        System.out.println(P1.getName()+" IS "+P1.getAge()+" Years Old");

    }
}
