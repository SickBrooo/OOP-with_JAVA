package ArrayList.tryyagain;

import ArrayList.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<student> list =new ArrayList<>();
        try
      {
          FileReader f1=new FileReader("Files/Student.txt");
          BufferedReader bf=new BufferedReader(f1);
          String line;
          while((line=bf.readLine())!=null)
          {
              String[] split=line.split(" ");
              student s=new student(split[0],
                      Integer.parseInt(split[1]),
                      Double.parseDouble(split[2]));
              list.add(s);
          }
          bf.close();
          for(student x:list)
          {
              System.out.println(x.Name+" "+x.id+" "+x.cgpa);
          }
          list.sort(new Comparator<student>() {
              @Override
              public int compare(student o1, student o2) {
                  if(o1.id< o2.id) return -1; // - means changekorar dorkar nai;
                  else if(o2.id<o1.id) return 1;// chage dorkar ache;;
                  else return 0;
              }
          });
          list.sort(new Comparator<student>()
      {
          public int compare(student o1,student o2)
          {
              if(o1.cgpa<o2.cgpa) return -1; // (-) means chage korar dorkar nai
              else if(o1.cgpa>o2.cgpa) return 1;
              else return 0;
          }
      });
          list.sort(new Comparator<student>()
          {
              public int compare(student o1,student o2)
              {
                  String line=o1.Name;
                  String line2=o2.Name;
                  return -line.compareTo(line2);
              }
          });
          System.out.println("-------------------------------");
      }catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
        try
        {
            FileWriter fw=new FileWriter("Files/Sorted.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            for(student x:list)
            {
                bw.write(x.Name+" "+x.id+" "+x.cgpa);
                bw.newLine();
            }
            bw.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
