package Mid_question_solve.Questions.LabTask;
class Course
{
    String Course_name;
    int duration;
    Course(String nm,int dur)
    {
        this.Course_name=nm;
        this.duration=dur;
    }
    void CourseInfo()
    {
        System.out.println("Course Name :"+Course_name);
        System.out.println("Duration :"+duration+" Months");
    }
}
class ProgrammingCourse extends Course
{
    String language;
    ProgrammingCourse(String nm,int dur,String Lang)
    {
        super(nm,dur);
        this.language=Lang;
    }
    void CourseInfo()
    {
        super.CourseInfo();
        System.out.println("Language: "+language);
    }
}
class MathCourse extends Course
{
    String Level;
    MathCourse(String nm,int dur,String Lev)
    {
        super(nm, dur);
        this.Level=Lev;
    }
    void CourseInfo()
    {
        super.CourseInfo();
        System.out.println("Level: "+Level);
    }
}
public class Online_learing {
    public static void main(String[] args) {
        ProgrammingCourse obj1= new ProgrammingCourse("OOP",6,"Java");
        MathCourse obj2=new MathCourse("Calculas",6,"Intermediate");
        obj1.CourseInfo();
        obj2.CourseInfo();
    }
}
