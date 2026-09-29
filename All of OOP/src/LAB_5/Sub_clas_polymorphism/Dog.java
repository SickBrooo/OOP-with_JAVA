package LAB_5.Sub_clas_polymorphism;

public class Dog extends Animal {
    String name;

    Dog(double age,String color,String Name)
    {
      super(age,color);
      this.name=Name;
    }
    void makesound()
    {
        System.out.println("Dog "+name+" Is barking");
    }
    void Print_all()
    {
        System.out.println("Name: "+name);
        super.Print_all();
    }

}
