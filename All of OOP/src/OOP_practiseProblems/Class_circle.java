package OOP_practiseProblems;

import java.util.Scanner;

public class Class_circle {
   private int radius;

    Class_circle(int radius)
    {
        this.radius=radius;
    }
    int getRadius()
    {
        return radius;
    }
    void setRadius(int radius) // this is setter methode. value will come from main function;;
    {
        this.radius=radius;
    }
   double area()
   {
       return (3.1416*radius*radius);
   }
   double circumference()
   {
       return 2*Math.PI*radius;
   }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int r;

        r=input.nextInt();
        Class_circle cr1=new Class_circle(r);

        System.out.println("The area is :"+cr1.area());
        System.out.println("The circumference is: "+cr1.circumference());
    }
}
