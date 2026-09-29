package Abstract_.Problem_solve;

public class Triangle extends Shape{

    Triangle(double base, double height)
    {
        super(base,height);
    }
    void shape()
    {
        System.out.println("This is Triangle");
    }
    void area()
    {
        double area=0.5*dim1*dim2;
        System.out.println("Area of the Triangle :"+area);
    }
}
