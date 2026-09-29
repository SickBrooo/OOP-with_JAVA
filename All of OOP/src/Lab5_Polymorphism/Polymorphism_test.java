package Lab5_Polymorphism;

//Methode OverRiding::child class contains a Method;
//That has a same signature as a parent class Method;
//?? what is Signature of a method ?? Its Name and parameter Types;
/*
 1. void Fnc(String name,int age) { };
  here Signature Types:Fnc(String,int);

 2. void Fnc(int age,String Name) { };
   here Signature Type:Fnc(int,String);

 NOTE: 1&2 are NOte Same because in Order To be Same The datatypes Sequence MUst Be same;
       even if the Names are Same;;
 */
class A
{
    String Name;
    A(String Name)
    {
        this.Name=Name;
    }
    void Print(String Name)
    {
        System.out.println(Name);
    }
}
class B extends A
{
    String Nm;
    B(String Name,String Nm)
    {
        super(Name);
        this.Nm=Nm;
    }
    void  Print(String N)
    {
        super.Print(N);
        System.out.println();
    }

}
public class Polymorphism_test {

}
