package Exception.main;

public class superheroException extends Exception{
    // here we just need the constructors
    superheroException()
    {
        System.out.println("You are too old");
    }
    superheroException(int energy)
    {
        System.out.println("Your energy cant drop below "+energy);
    }

}
