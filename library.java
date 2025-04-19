import java.util.ArrayList;
//this class is to collect the books in array that his name is"books"
public class library {
    private ArrayList<Book> books =new ArrayList<>();//array of books 

    public void addBook(Book b1){
        books.add(b1);
    }

    public void Display_book(){
        System.out.println("the Books in the library is  : ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Book b1:books){
            b1.Display_Info();
            System.out.println("----------------------------------");
        }
    }
}
