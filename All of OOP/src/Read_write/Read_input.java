package Read_write;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Read_input {
    public static void main(String[] args) {
        try
        {
            File f1=new File("Files/Saidur.txt"); 
            File f2=new File("Files/output.txt");
            FileWriter fw=new FileWriter(f2);
            Scanner sc=new Scanner(f1);

            String line= sc.nextLine();
            double a,b;
            String[] split=line.split(" ");
            a=Double.parseDouble(split[0]);
            b=Double.parseDouble(split[1]);
            double sum=a+b;
            fw.write(""+sum);
            fw.close();
            System.out.println("Created");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
