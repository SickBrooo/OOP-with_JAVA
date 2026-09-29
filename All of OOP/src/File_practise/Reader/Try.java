package File_practise.Reader;

import File__.Student;

import java.io.File;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        try
        {
            File f1=new File("Files/C.txt");
            Scanner sc=new Scanner(f1);
            Student[] arr=new Student[10];
            int idx=0;
            for(int i=0;sc.hasNext();i++)
            {
               String name=sc.next();// for reading name it is sc.Next();
               int id=sc.nextInt();
               double cgpa= sc.nextDouble();
               arr[i]=new Student(name,id,cgpa);
            }
            for(Student x:arr)
            {
                if(x==null) break;
                System.out.println(x.name+" "+x.id+" "+x.cgpa);
            }
            sc.close();
        }
        catch(Exception e)
        {

            System.out.println(e.getMessage());
        }
    }
}
