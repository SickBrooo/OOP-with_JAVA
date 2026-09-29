// THis is Encapsulation::::
package LAB4;

public class ClockTime {
    private int second;
     private int minute;
    private int hour;

    ClockTime(int second,int minute,int hour)
    {
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    int getHour()
    {
        return hour;
    }
    void setHour(int hour)
    {
       if(hour>=0&&hour<24)
        this.hour=hour;
    }
}
class Encapsulationtest{
    public static void main(String[] args) {
        ClockTime t1=new ClockTime(50,50,12);
        t1.setHour(1000);

        System.out.println(t1.getHour());
    }
}
