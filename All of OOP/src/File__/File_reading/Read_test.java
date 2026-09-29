package File__.File_reading;

import File__.Student;

import java.io.File;
import java.util.Scanner;

public class Read_test {
    public static void main(String[] args) {
        try
        {
            File f1=new File("Files/B.txt");
            Scanner sc=new Scanner(f1);
            Student[] arr=new Student[10];
            for(int i=0;sc.hasNext();i++)// important s.HasNext;;;
            {
                String name= sc.next();
                int id=sc.nextInt();
                double cgpa=sc.nextDouble();
                arr[i]=new Student(name,id,cgpa);
            }
            for(Student X:arr)
            {
                if(X==null)break;
                System.out.println(X.name+" "+X.id+" "+X.cgpa);
            }
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
