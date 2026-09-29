package Lab4_Inheritance;
 class classA
{
    private int var1;
   public void fnc(){
            System.out.println(var1);
        }

    public void setVar1(int var1) {
        this.var1 = var1;
    }
    public int getVar1()
    {
        return var1;
    }
}
class classB extends classA
{
    int var2;
    void fnc2()               //with the members of classA it has a total of 4 members;
    {
        System.out.println(getVar1());
        System.out.println(var2);
    }
}
public class Inheritance_test {
    public static void main(String[] args) {
       classB objB=new classB();
        objB.setVar1(10);   // Inherited from class A
        objB.var2=20;
        objB.fnc();      // Inherited from class A
        objB.fnc2();
    }
}
