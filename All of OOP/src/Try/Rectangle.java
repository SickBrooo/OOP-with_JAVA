package Try;

public class Rectangle {
    double height;
    double width;
    // Non parameterized Constructor // default Constructor;;
//    Rectangle()
//    {
//    }
    // Parameterized Constructor
    Rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle(10.5,16.2);

        System.out.println(r1.height);
    }
}
