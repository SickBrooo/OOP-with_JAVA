package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     try{
         int a=10/0;
        System.out.println(a);//
     }
     catch (ArithmeticException e1)
     {
         System.out.println(e1.getMessage());
     }
     catch (InputMismatchException e2)
     {
         System.out.println("Give integer Input");
     }
     catch (Exception e3)
     {
         System.out.println(e3.getMessage());
     }
     finally {
         System.out.println("Hello Programmers");
     }

    }
}
