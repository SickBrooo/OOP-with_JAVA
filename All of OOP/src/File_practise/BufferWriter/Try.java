package File_practise.BufferWriter;

import File_practise.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Try {
    public static void main(String[] args) {
        try
        {
            FileWriter f1=new FileWriter("Files/D.txt");
            BufferedWriter br=new BufferedWriter(f1);
            Student[] arr=new Student[3];
            arr[0]=new Student("Adel",01,3.89);
            arr[1]=new Student("Mahamud",01,3.89);
            arr[2]=new Student("Sayadi",01,3.89);
            for(Student x:arr)
            {
                br.write(x.Name+" "+x.id+" "+x.cgpa+" ");
                br.newLine();
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
