package Abstract_.Problem_solve;

public class Main {
    public static void main(String[] args) {
      Shape s; // here shape is a abstract class ;;
        // we cannot create object of abstract class directly;;
      s=new Rectangle(10,20);
        s.shape();s.area();
      s=new Circle(5);
      s.shape();s.area();
      s=new Triangle(6,7);
      s.shape();s.area();
    }
}
