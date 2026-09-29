package Abstract_;

public class Test_abs
{
    public static void main(String[] args) {
        MobileUser mu; // just creating a refarence variable of mobileuser;
        // because Abstract class Cant be instantiated;;
        mu=new Karim();
        mu.SendMessage();
        mu.call();
        mu=new Rahim();
        mu.SendMessage();
        mu.call();
    }
}
