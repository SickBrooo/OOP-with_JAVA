package Thread.Question_solving;

class Even_sum implements Runnable
{
    int sum=0;
    public void run()
    {
        for(int i=2;i<=50;i+=2)
        {
            sum+=i;
        }
    }
    int getsum()
    {
        return sum;
    }
}
class Odd_sum extends Thread
{
    int sum=0;
    public void run()
    {
        for(int i=1;i<50;i+=2)
        {
            sum+=i;
        }
    }
    int get_sum()
    {
        return sum;
    }
}
public class Two_tread_combining {
    public static void main(String[] args)throws InterruptedException {
        Even_sum e=new Even_sum();
        Odd_sum o=new Odd_sum();

        Thread t1=new Thread(e);

        t1.start();
        o.start();

        t1.join();
        o.join();

        int even= e.getsum();  int odd=o.get_sum();
        int result=odd-even;
        System.out.println(result);

    }

}
