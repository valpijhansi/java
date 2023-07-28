package Book;

public class Book {
    private int bookNo;
    private String bookName;
    private double price;

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    Book(){

    }
    Book(int num,String name,double amount){
        this.bookNo = num;
        this.bookName = name;
        this.price = amount;

    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
    class SpecialEditionBook extends Book{
        private double discount;

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public SpecialEditionBook(int bookNo, String bookName, double price, double discount) {
            super(bookNo, bookName, price);
            this.discount = discount;
        }




        @Override
        public void display(){
            super.display();

            System.out.println("Discount:"+discount);

        }

        @Override
        public String toString() {
            return "SpecialEditionBook{" +
                    "bookNo:" + getBookNo() +
                    ", bookName:" + getBookName() +
                    ", bookPrice:" + getPrice()+
                    ", discount=" + discount +

                    '}';
        }
    }

