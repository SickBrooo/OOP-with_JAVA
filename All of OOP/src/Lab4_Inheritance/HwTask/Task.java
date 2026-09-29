package Lab4_Inheritance.HwTask;
class Animal
{
    private String Name;
    private int Age;

    Animal(String Name) {
        this.Name = Name;
    }
    Animal(int age)
    {
        this.Age=age;
    }
    void PrintName()
    {
        System.out.println("Inside Animal Class:"+Name);
    }
    void PrintAge()
    {
        System.out.println("Inside Animal Class:"+Age);
    }
}
class Animal2 extends Animal{
    private String Nam;

    Animal2(String name,String nam)
    {
        super(name); //here need to put the String "name" just.
        this.Nam=nam;
    }
    void PrintAnimal2()
    {
        super.PrintName();
        System.out.println("Inside Animal2 CLass:"+this.Nam);
    }
}
class Animal3 extends Animal
{
    private String Name;

    Animal3(int age,String name)
    {
        super(age);
        this.Name=name;
    }
    void PrintINfoAnimal3()
    {
        super.PrintAge();
        System.out.println("Inside Animal3 Class:"+this.Name);
    }
}
public class Task {
    public static void main(String[] args) {
        Animal2 cheeta=new Animal2("Royal bengal Tiger","Cheeta");
        Animal3 cat=new Animal3(13,"Persian");

        cheeta.PrintAnimal2();
        cat.PrintINfoAnimal3();

    }
}
