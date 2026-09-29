package Thread;


class kamla extends Thread
{

//  kamla(String name)
//  {
//      super(name);
//  }
  public void run()
  {
      try
      {
          for(int i=0;i<5;i++)
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
public class TEST {
    public static void main(String[] args){
     //   Thread.currentThread().setName("Ashol Kamla");
//        String Kamla=Thread.currentThread().getName();
//        System.out.println(Kamla);

        kamla k1=new kamla();
        kamla k2=new kamla();
        k1.start();
        k2.start();
    }
}
