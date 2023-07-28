package Book;

public class Main {
    public static void main(String[] args) {
        Book b = new Book(121,"Java",120);
        b.display();
        SpecialEditionBook b1 = new SpecialEditionBook(120,"Java1",120,10);
        b1.display();

    }
}
