package Thread;

class Worker implements Runnable
{
    public void run()
    {
        try
        {
           for(int i=0;i<=5;i++)
           {
               System.out.println(Thread.currentThread().getName()+" "+i);
               Thread.sleep(1000);
           }
        }catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class TEST2 {
    public static void main(String[] args) throws InterruptedException {
       Worker w1=new Worker();
       Worker w2=new Worker();

       Thread t1=new Thread(w1,"Adel");
       Thread t2=new Thread(w2,"Sayadi");

       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.println("Build Done"); // Without Join this Executes first

    }
}
