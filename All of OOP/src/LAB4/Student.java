package LAB4;

public class Student {
    private String Name;
    private int id;
    private double cgpa;

    Student(String Name,int id,double cgpa)
    {
        this.Name=Name;
        this.id=id;
        this.cgpa=cgpa;
    }
    void setName(String Name)
    {
        this.Name=Name;
    }
    String getName()
    {
        return Name;
    }
    void setId(int id)
    {
        if(id>=100000&&id<999999)
            this.id=id;


    }
    int getId()
    {
        return id;
    }
    void setCgpa(double cgpa)
    {
        this.cgpa=cgpa;
    }
    double getCgpa()
    {
        return cgpa;
    }
}
class Encapsulation_Student
{
    public static void main(String[] args) {
        Student st1=new Student("Adel",999999,3.33);

       st1.setId(112430);
        System.out.println(st1.getId());
    }
}
