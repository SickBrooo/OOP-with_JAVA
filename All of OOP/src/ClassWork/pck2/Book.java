package ClassWork.pck2;

import ClassWork.Pck1.Pen;

public class Book {
  public  String Name;
  public  int total_pages;

   public Book(String Name, int total_pages)
    {
        this.Name=Name;
        this.total_pages=total_pages;
    }

    public static void main(String[] args) {
        Book book1=new Book("Histroy",350);
        Book book2=new Book("English",700);
        Pen obj1=new Pen("Red",90);
        System.out.println(book1.Name);
        System.out.println(book2.Name);
        System.out.println(obj1.Color);

    }
}
