package Custom_Exception;

public class Superher {
    String Name;
    int age;
    int energy;
    public Superher(String name, int age,int energy) {
        Name = name;
        this.age = age;
        this.energy=energy;
    }
    void check()
    {
        try
        {
            if(age<50) throw new SuperheroException();
            else if(age>50) throw new SuperheroException(energy);
            else System.out.println("You're A SuperHero");
        }catch(SuperheroException e)
        {
            System.out.println("You're A SuperHero");

        }
    }
}
