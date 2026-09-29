package LAB_5.Sub_clas_polymorphism;

public class Animal {
    private double age;
    private String color;

    Animal(double age,String Color)
    {
        this.age=age;
        this.color=Color;
    }
    void makesound()
    {
        System.out.println("Animal Is Making Sound");
    }
    void Print_all()
    {
        System.out.println("Age "+age);
        System.out.println("Color "+color);
    }
}
