import java.util.InputMismatchException;
import java.util.Scanner;

public class Book {
    private int BookID;
    private int pages;
    private double price;

    public void get() {
        try{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Book_ID: ");
        BookID = scan.nextInt();
        System.out.print("Enter the number of Pages: ");
        pages = scan.nextInt();
        System.out.print("Enter the Price : ");
        price = scan.nextDouble();
        }catch(InputMismatchException e) {
         System.out.println("Error: inavalid number");

        }
    }

   public void setValues(int bookId,int Pages,double cost){
      BookID = bookId;
      pages = Pages;
      price = cost;
   }

   public double getPrice(){
    return this.price = price;
   }
   public void Show() {
    System.out.println("BOOk_ID: " + BookID);
    System.out.println("NO of Pages: " + pages);
    System.out.println("The price of the Book:" + price);

   }

   public static void main(String[] args) {
    Book b = new Book();
    b.get();
    b.Show();

    System.out.println(b.getPrice());
    
   }
    
    
}
