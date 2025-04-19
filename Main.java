import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input=new Scanner (System.in);
        library myLibrary =new library();
        System.out.println("Welcome to library management system");
        System.out.println("---------------------------------------");
        System.out.println("Enter the Number of Books you want:");
        int numberofbooks= input.nextInt();
        input.nextLine();
        for (int i =1;i<=numberofbooks;i++){
             System.out.println("Enter details for Book #"+i);
             System.out.println(" Title "+i+":");
             String title= input.nextLine();

             System.out.println(" Author "+i+":");
             String author = input.nextLine();

             System.out.println("Publication Year :");
             int year= input.nextInt();
             input.nextLine();

             Book b1=new Book(title,year,author);
             myLibrary.addBook(b1);
               
             System.out.println("Thank you for using the Library Management System !");
        }
        myLibrary.Display_book();
        input.close();

    }
}
