package File__.Using_buffer_writer;


import File__.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;

// code of BufferWriter
public class Buffer_writer {
    public static void main(String[] args) {
        try
        {
            FileWriter F1=new FileWriter("Files/B.txt");
            BufferedWriter Bf=new BufferedWriter(F1);
            Bf.write("Hello World");
            Bf.newLine();
            Bf.write(100+"");
            Bf.newLine();
            Student[] arr=new Student[3];
            arr[0]=new Student("Adel",100,4.00);
            arr[1]=new Student("Mahamud",200,3.00);
            arr[2]=new Student("Sayadi",300,5.00);
            for(Student X:arr)
            {
               Bf.write(X.name+" "+X.id+" "+X.cgpa);
               Bf.newLine();
            }
            Bf.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
