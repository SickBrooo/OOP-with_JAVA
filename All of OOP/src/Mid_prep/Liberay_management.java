package Mid_prep;

import ClassWork.pck2.Book;

class book
{
    private String title;
    private String author;
    private double Price;

    book(String title,String author,double Price)
    {
        this.author=author;
        this.title=title;
        this.Price=Price;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public double getPrice()
    {
        return this.Price;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        Price = price;
    }
    public String Display()
    {
        return("Title:"+this.title+",Author: "+this.author+",Price: "+this.Price);
    }
}
class Textbook extends book
{
    private String Subject;

    Textbook(String title,String author,Double price,String sub)
    {
        super(title,author,price);
        this.Subject=sub;
    }
    public void setSubject(String sub)
    {
        this.Subject=sub;
    }
    public String getSubject()
    {
        return this.Subject;
    }
    public String Display()
    {
        return super.Display()+",Sub: "+this.Subject;
    }
}
class referenceBook extends Textbook
{
    private int Edition;
    referenceBook(String title,String author,double price,String Sub,int edition)
    {
        super(title,author,price,Sub);
        this.Edition=edition;
    }
    referenceBook(String T,String A,Double P,String S)
    {
        this(T,A,P,S,1); // setting Default Edition!!!!
    }
    public void setEdition(int edition)
    {
        this.Edition=edition;
    }
    public int getEdition()
    {
        return this.Edition;
    }
    public String Display()
    {
        return super.Display()+"subject:"+getSubject()+"Edition: "+this.Edition;
    }
}
public class Liberay_management {
    public static void main(String[] args) {
        book obj1=new book("calculas","Asif",900);
        Textbook obj2=new Textbook("fan","jk",800.0,"math");
        referenceBook obj3=new referenceBook("B3","B2khan",600.0,"math");

        book[] array=new book[3];
        array[0]=obj1;
        array[1]=obj2;
        array[2]=obj3;

        for(book objects:array)
        {
            System.out.println( objects.Display());
        }
    }
}
