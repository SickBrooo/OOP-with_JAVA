package lab_7_Abstract_Interface.Abstract_class;
abstract class shape
{
    double d1;
    double d2;
    shape(double D1,double D2)
    {
        this.d1=D1;
        this.d2=D2;
    }
    abstract void getArea();
}
class Rectangle extends shape
{
    Rectangle(double d1,double d2)
    {
        super(d1,d2);
    }
    void getArea()
    {
        System.out.println("Area of the Rectangle:"+d1*d2);
    }
}
class Triangle extends shape
{
    Triangle(double base,double height)
    {
        super(base,height);
    }
    void getArea()
    {
        System.out.println("Area of the Triangle: "+0.5*d1*d2);
    }
}
public class abstract_practise {
    public static void main(String[] args) {
        shape obj1=new Rectangle(10,20);
        obj1.getArea();
        shape obj2=new Triangle(10,5);
        obj2.getArea();
    }
}
