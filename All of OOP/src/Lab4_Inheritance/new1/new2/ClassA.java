package Lab4_Inheritance.new1.new2;
class ClsA
{
    int var1;
    String Name;
    ClsA(int var1,String Name)
    {
        this.var1=var1;
        this.Name=Name;
    }
    ClsA(int var1)
    {
        this.var1=var1;
    }
    void fnc1()
    {
        System.out.println("Inside the Cls A:"+var1);
    }
}
class clsB extends ClsA
{
    int var2;
    clsB(int var1,String Name,int var2)
    {
        super(var1); // we cannot add another Super call ;;
        this.var2=var2;
    }
    void fnc2()
    {
        super.fnc1();
        System.out.println("Inside ClsB:"+super.var1);
        System.out.println(var2);
    }
}
// Rules to Call Super(); Constructor: it Must be the first statement of a constructor;
public class ClassA {
    public static void main(String[] args) {
       clsB objB=new clsB(07,"Adel Mahmud Sayadi",100);
       objB.fnc2();

    }
}

