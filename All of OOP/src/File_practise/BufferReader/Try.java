package File_practise.BufferReader;

import File_practise.Student;

import java.io.BufferedReader;
import java.io.FileReader;

public class Try {
    public static void main(String[] args) {
        try
        {
            FileReader f1=new FileReader("Files/C.txt");
            BufferedReader bf=new BufferedReader(f1);
            Student[] arr=new Student[10];
            int idx=0;
            while(true)
            {
                String line=bf.readLine();
                if(line==null) break;
                String[] split=line.split(" ");
                arr[idx]=new Student(split[0],Integer.parseInt(split[1]),Double.parseDouble(split[2]));
                idx++;
            }
            bf.close();
            for(Student x:arr)
            {
                if(x==null) break;
                System.out.println(x.Name+" "+x.id+" "+x.cgpa);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
