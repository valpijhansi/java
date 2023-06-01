package Library;
public class Book {
    String bookName;
    String bookNo;
    int NumOfBooks;
    String authourName;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookNo() {
        return bookNo;
    }
    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }
    public int getNumOfBooks() {
        return NumOfBooks;
    }
    public void setNumOfBooks(int numOfBooks) {
        NumOfBooks = numOfBooks;
    }
    public String getAuthourName() {
        return authourName;
    }
    public void setAuthourName(String authourName) {
        this.authourName = authourName;
    }
    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookNo=" + bookNo + ", NumOfBooks=" + NumOfBooks + ", authourName="
                + authourName + "]";
    }
    
}