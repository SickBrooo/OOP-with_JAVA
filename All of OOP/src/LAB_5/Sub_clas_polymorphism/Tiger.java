package LAB_5.Sub_clas_polymorphism;

public class Tiger extends Animal {
  private String Name;
  Tiger(double age,String Color,String Name)
  {
      super(age,Color);
      this.Name=Name;
  }
  //Method Overriding
  void makesound()
  {
      System.out.println("Tiger "+Name+" Is Roaring");
  }
  void Print_all()
  {
      System.out.println("Name "+Name);
      super.Print_all();
  }
  void Eat()
  {
      System.out.println("Tiger "+Name+" Eats Meat");
  }
}
