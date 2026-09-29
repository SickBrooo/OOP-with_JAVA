package File_practise.PrintWriter;

import File_practise.Student;

import java.io.File;
import java.io.PrintWriter;

public class Try {
    public static void main(String[] args) {
        try
        {
           File f=new File("Files/C.txt");
            PrintWriter p1=new PrintWriter(f);
            Student[] arr=new Student[3];
            arr[0]=new Student("Adel",1,3.89);
            arr[1]=new Student("Mahamud",1,3.89);
            arr[2]=new Student("Sayadi",1,3.89);
            for(Student x:arr)
            {
               p1.println(x.Name+" "+x.id+" "+x.cgpa);
            }
            p1.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
