package customer;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(12,"Mounika","Kadiri");
        c.display();

        Account a  = new Account(121,"Lokesh",200000);
        a.show();

        Account a1 = new Account(121,"Jhansi",20000);
        a1.show();

    }
}
