package Try;

import java.util.Scanner;

public class Triangle  {
    //Instance variables;
    double height;
    double length;

    Triangle(double height,double length)  // Constructor
    {
        this.height=height;
        this.length=length;
    }
    void getArea()   // jei object theke call kora hobe seitar height and length;
    {
        System.out.println("The area is: "+height*length);
    }
    void printALL()
    {
        System.out.println("The height is :"+height);
        System.out.println("The length is :"+length);
    }
    public static  void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Triangle tri1=new Triangle(10,20);

//        double area= tri1.getArea();
//        System.out.println(area);
//        tri1.printALL();
        Triangle[] Arr=new Triangle[5];
        for(int i=0;i<5;i++)
        {
            double height= input.nextDouble();
            double length=input.nextDouble();
            Arr[i]=new Triangle(height,length);
        }
       for(Triangle x:Arr)
       {
           x.getArea();
       }
    }
}
