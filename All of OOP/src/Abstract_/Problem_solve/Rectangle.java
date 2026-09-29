package Abstract_.Problem_solve;

public class Rectangle extends Shape{

    Rectangle(double dim1,double dim2)
    {
        super(dim1,dim2);
    }
    void shape()
    {
        System.out.println("This is Rectangle");
    }
    void area()
    {
        double area=dim1*dim2;
        System.out.println("Area of the Rectangle:"+area);

    }
}
