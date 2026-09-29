package Mid_question_solve.Questions;
class Figure
{
    void render()
    {
        System.out.println("Rendering...");
    }
}
class Square extends Figure
{
    void render()
    {
        System.out.println("Rendering Square...");
    }
}
class Oval extends Figure
{
    void render()
    {
        System.out.println("Rendering Oval");
    }
}
class Polygon extends Figure
{
    void render()
    {
        System.out.println("Rendering Polygon");
    }
}
public class Question_5 {
    public static void main(String[] args) {
        Figure[] f=new Figure[3];// this is Unique Array that holds Objects;
        f[0]=new Square();
        f[1]=new Oval();
        f[2]=new Polygon();
        for(Figure calls:f)
        {
           calls.render();
        }
    }
}
