package File__.File_reading.Using_buffered_reader;

import File__.Student;

import java.io.BufferedReader;
import java.io.FileReader;

public class read_test {
    public static void main(String[] args) {
        try
        {
            FileReader f1=new FileReader("Files/B.txt");
            BufferedReader br=new BufferedReader(f1);
            Student[] arr=new Student[10];
            int index=0;
            while(true)
            {
                String line= br.readLine();
                if(line==null) break;
                String[] parts=line.split(" ");
                arr[index]=new Student(parts[0],Integer.parseInt(parts[1]),Double.parseDouble(parts[2]) );
                index++;
            }
            br.close();
            for(Student x:arr)
            {
                System.out.println(x.name+" "+x.id+" "+x.cgpa);

            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
