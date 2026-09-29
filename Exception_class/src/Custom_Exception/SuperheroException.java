package Custom_Exception;

public class SuperheroException extends Exception {

    SuperheroException()
    {
        System.out.println("Youre Too Young For this Job");
    }
    SuperheroException(int energy)
    {
        if(energy<90) System.out.println("Youre Too weak");
    }
}
