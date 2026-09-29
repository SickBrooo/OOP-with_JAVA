package ClassWork.Pck1;

import ClassWork.pck2.Book;

public class Pen {
   public String Color;
   private int price;

     public Pen(String Color, int price)
    {
        this.Color=Color;
        this.price=price;
    }

    public static void main(String[] args) {
        Pen pen1=new Pen("Black",50);
        Pen pen2=new Pen("Pink",100);
        Book obj1=new Book("Bangla",300);


    }
}
