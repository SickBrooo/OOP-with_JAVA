package File__;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//Print_Writer;-> er jonno lage File();
// BufferedWriter -> er Jonno lage FileWriter();
public class File_writing {
    public static void main(String[] args) {
        try
        {
            File f1= new File("Files/A.txt");
            PrintWriter P1=new PrintWriter(f1); // passing that new file Object here!!
             P1.println("Hello I am Writing Into A file");
             Student[] arr=new Student[3];

             arr[0]=new Student("Adel",1,3.89);
            arr[1]=new Student("Mahamud",2,3.9);
            arr[2]=new Student("Sayadi",3,4.00);
            for(Student X: arr)
            {
                P1.println("Name: "+X.name+","+"Id:"+X.id+","+"Cgpa:"+X.cgpa); // here P1 is the Object name of the//PrintWriter;;;
            }
//
            P1.close(); // must need to Close;
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
