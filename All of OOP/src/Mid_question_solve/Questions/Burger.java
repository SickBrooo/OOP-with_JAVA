package Mid_question_solve.Questions;
class berger
{
    String name;
    String size;
    public berger(String name,String Size)
    {
        this.name=name;
        this.size=Size;
    }
    public void prepare()
    {
        System.out.println("Preparing "+name+" "+size+" Burger");
    }
}
class BeefBurger extends berger
{
    String flavour;
    int price;
    public BeefBurger(String name,String size,String flavour,int price)
    {
        super(name, size);

        this.flavour=flavour;
        this.price=price;
    }
    public void prepare()
    {
        super.prepare();
        System.out.println("Flavor: "+flavour+'\n'+"Price: "+price);
    }
}
class veggieBerger extends berger
{
    String Flavour;
    int Price;
    public veggieBerger(String Name,String size,String flavr,int price)
    {
        super(Name,size);
        this.Flavour=flavr;
        this.Price=price;
    }
    public void prepare()
    {
        super.prepare();
        System.out.println("Flavor: "+Flavour+'\n'+"Price: "+Price);
    }

}
public class Burger {
    public static void main(String[] args) {
      berger BeefBurger=new BeefBurger("Double Decker","Large","Spicy",400);
      BeefBurger.prepare();
      berger VegieBerger=new veggieBerger("Mashroom Delight","small","Sweet",300);
      VegieBerger.prepare();
    }
}
