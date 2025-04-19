package library_system;
import java .util.Scanner;
public class Book {
    private String author;
    private int year;
    private String title;
   public Book(String author,int year,String title)
   {
   this.title=title;
   this.author=author;
   this.year=year;
   }
  // in the upper is the class and his constructor of the same name

public void  Display_Info()//func to display the data entered
{
    System.out.println("the title is :"+ title );
    System.out.println("the author is :"+ author );
    System.out.println("the year is :"+ year );
}
}
