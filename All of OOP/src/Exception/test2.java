package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int flag=1;
        while(flag==1)
        {
            try
            {
                int a= input.nextInt();
                int b= input.nextInt();
                int div=a/b;
                flag=0;
                System.out.println(div);

            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException x)
            {
                System.out.println("Wrong Input"); //a problem
                input.nextLine();
            }

        }
    }
}
