package Read_write.s;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        File input= new File("Files/Input1.txt");
        File output= new File("Files/Output1.txt");
        int count=0;
        double sum=0;
        try{
            input.createNewFile();
            output.createNewFile();
            Scanner reader= new Scanner(input);
            while (reader.hasNextLine()){
                double num= reader.nextDouble();
                sum+=num;
                count++;

            }
            reader.close();
            double avg=0;
            if(count>0){
                avg=sum/count;
            }
            FileWriter writer = new FileWriter(output);
            writer.write("Average:"+avg);
            writer.close();

            System.out.println("Successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}