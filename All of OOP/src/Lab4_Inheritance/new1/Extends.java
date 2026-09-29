package Lab4_Inheritance.new1;
class Aa
{
    int var1;

    void fnc1()
    {
        System.out.println("Inside Class Aa:"+var1);
    }
}
class B extends Aa
{
    int var2;
    void fnc1()
    {
        System.out.println("Inside Class B:"+this.var1) ;
    }
    void fnc2()
    {
        super.fnc1();
        fnc1();
        System.out.println(this.var1);
        System.out.println(super.var1);
        System.out.println(var2);
    }
}
public class Extends {
    public static void main(String[] args) {
        B obj1=new B();
        obj1.var1=100;
        obj1.var2=200;
        obj1.fnc2();

    }
}
