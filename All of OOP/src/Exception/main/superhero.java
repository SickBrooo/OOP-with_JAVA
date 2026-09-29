package Exception.main;

public class superhero {
    int age;
    int energy;
    superhero(int age,int energy)
    {
        this.energy=energy;
        this.age=age;
    }

    void check()
    {
        try
        {
            if(age>58)
            {
                throw new superheroException(); //calling parameter less
            }
            else if(energy<80) throw new superheroException(energy);//with parameter
            else System.out.println("You are a superhero");
        }catch(superheroException e)
        {
            System.out.println("All Handled");
        }

    }
}
