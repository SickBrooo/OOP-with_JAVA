package Abstract_.Problem_solve;

public class Circle extends Shape{

    Circle(double r)
    {
        super(r,r);
    }
    void shape()
    {
        System.out.println("This is Circle");
    }
    void area()
    {
     double area=Math.PI*dim1*dim2;
        System.out.println("Area of the Circle: "+area);
    }
}
