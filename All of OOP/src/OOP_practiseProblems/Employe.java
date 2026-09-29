package OOP_practiseProblems;

import java.util.Scanner;

public class Employe {
    String Name;
    String Job_title;
    int salary;

    Employe(String Name,String job_title,int salary)
    {
        this.Name=Name;
        this.Job_title=job_title;
        this.salary=salary;
    }
    void setSalary(int salary)
    {
        this.salary=salary;
    }
    String getName()
    {
        return Name;
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        Employe[] Er=new Employe[n];
        for(int i=0;i<n;i++)
        {
            String Name;
            String job_title;
            int salary;
            Name=input.nextLine(); job_title=input.nextLine();
            salary=input.nextInt(); // here the problemn is Space separated Input Can't be count; must hit enter;
            input.nextLine();
            Er[i]=new Employe(Name,job_title,salary);

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(Er[i].Name+" "+Er[i].Job_title+" "+Er[i].salary);
        }
    }

}
