package Lab5_Polymorphism;

public class Overloading {
    String name;
    int age;
    void fnc1(String name)
    {
        System.out.println(name);
    }                             // Method Names are Same but Different PArameter;
    void fnc1(int age)
    {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Overloading  obj1=new Overloading();
        obj1.fnc1("Adel");
        obj1.fnc1(23);
    }
}
