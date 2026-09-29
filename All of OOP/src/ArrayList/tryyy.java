package ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

public class tryyy {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
//        list.add(100);
//        list.add(200);
//        list.add(500);
//        list.add(800);
//        list.set(1,600); // this replaces the value of Index 1 with 600;
//        list.add(2,900); // this add the value 900 in that specific index 2;
//        //        System.out.println(list);
//        System.out.println(list.get(3));
//        for(int x:list)
//        {
//            System.out.println(x);
//       }
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
         try
         {
             FileReader f1=new FileReader("Files/Student.txt");
             BufferedReader br=new BufferedReader(f1);
             String line;
             while(true)
             {
                  line=br.readLine();
                 if(line==null) break;
                 String[] Spl=line.split(" ");
                 Student s=new Student(Spl[0],Integer.parseInt(Spl[1]),Double.parseDouble(Spl[2]));
                 //System.out.println(Spl[0]+" "+Integer.parseInt(Spl[1])+" "+Double.parseDouble(Spl[2]));
                list.add(s);
             }
             br.close();
             list.sort(new Comparator<Student>() {
                 @Override
                 public int compare(Student o1, Student o2) {
                     // If return is posetive o1 goes befor o2;
                     // if return is negative o2 goes befor o1;
                     if(o1.id<o2.id) return -1;
                     else if(o1.id>o2.id) return 1;
                     else {
                         if (o1.cgpa > o2.cgpa) return -1;
                         else if (o1.cgpa < o2.cgpa) return 1;
                         else return 0;
                     }
                 }
             });
             list.sort(new Comparator<Student>() {
                 @Override
                 public int compare(Student o1,Student o2) {
                     String line=o1.Name;
                     String line2=o2.Name;
                     return line.compareTo(line2); // sorint ascending
                     // sorting descending ? just put negative before -line.comppareTo;

                 }
             });
             for(Student x:list)
            {
               System.out.println(x.Name+" "+x.id+" "+x.cgpa);
            }
         }catch(Exception e)
         {
             System.out.println(e.getMessage());
         }


    }
}
