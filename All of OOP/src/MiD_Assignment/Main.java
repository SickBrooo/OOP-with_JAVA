package MiD_Assignment;
class Book
{
    private String Title;
    private   String Author;
    private  boolean is_borrowed;
    private   static final int max_books=200;
    Book(String title,String author)
    {
        this.Author=author;
        this.Title=title;
        is_borrowed=false;
    }
    String getTitle()
    {
        return Title;
    }
    void setTitle(String title)
    {
        this.Title=title;
    }
    String getAuthor()
    {
        return Author;
    }
    void setAuthor(String author)
    {
        this.Author=author;
    }
    boolean getIs_borrowed()
    {
            return is_borrowed;
    }
    void setIs_borrowed( boolean borrow)
    {
        this.is_borrowed=borrow;
    }
    int getMax_books()
    {
        return max_books;
    }
    public void displayInfo()
    {
        System.out.println("Titel of the BOOK : "+Title);
        System.out.println("Author Of the BOOk: "+Author);
    }
    public void displayInfo(boolean showStatus)
    {
        displayInfo();
        if(showStatus)
        {
            System.out.println("Borrowed: "+is_borrowed);
        }
    }
    public void borrow() // do not need any parameter here!!!
    {
        if(is_borrowed) System.out.println("You can Not borrow the book! "+this.Title);
        else
        {
            System.out.println("You can borrow the BOOk! "+this.Title);
            is_borrowed=true;
        }
    }
   public void returnBook()
    {
        if(is_borrowed)
        {
            System.out.println("Returned the Book! "+this.Title);
            is_borrowed=false;
        }
        else System.out.println("Book is Not Borrowed! "+this.Title);
    }

}
class FictionBook extends Book
{
   private String genre;
    FictionBook(String title,String author,String genre)
    {
        super(title,author);
        this.genre=genre;
    }
    void setGenre(String genre)
    {
        this.genre=genre;
    }
    String getGenre()
    {
        return genre;
    }
   public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Genre: "+genre);
    }
}
class NonFictionBook extends Book
{
   private String Subject;
    NonFictionBook(String title,String author,String subject)
    {
        super(title,author);
        this.Subject=subject;
    }
    void setSubject(String sub)
    {
        this.Subject=sub;
    }
    String getSubject()
    {
       return Subject;
    }
   public void displayInfo(boolean showStatus)
    {
        super.displayInfo(showStatus);
        if(showStatus) System.out.println(this.getTitle()+getIs_borrowed());
    }
}
public class Main {
    public static void main(String[] args) {

        Book[] myBooks=new Book[3];
        NonFictionBook Book1=new NonFictionBook("Harry Potter","william son","Mystry");
        FictionBook Book2=new FictionBook("Wizards","James Bond","Thriller");
        FictionBook Book3=new FictionBook("Twilight","Richard","Sci-fi");
        myBooks[0]=Book1; myBooks[1]=Book2; myBooks[2]=Book3;
        myBooks[0].setIs_borrowed(true);

        for(int i=0;i<3;i++)
        {
            myBooks[i].displayInfo();
        }
        System.out.println("-------------------------------");
        myBooks[0].borrow();
        myBooks[2].returnBook();
        System.out.println('\n');
        System.out.println("Showing status of "+myBooks[1].getTitle()+'\n');
        myBooks[1].displayInfo(true);
    }
}
