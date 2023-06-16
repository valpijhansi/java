import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BankDetails {
    public static void main(String[] args) {
        

        try {

            Bank customer[] = {new Bank("jaanu",21,2000), 
                               new Bank("lucky",22,3000),
                               new Bank("chotu",22,3500)};
                               System.out.println(customer.length);

                FileOutputStream fos = new FileOutputStream("customer.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeInt(customer.length); 

                for(int i=0;i<customer.length;i++)
                   oos.writeObject(customer[i]); 
                   oos.close();
                   fos.close();


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
class Bank implements Serializable {

    double balance;
    String name;
    int age;

    Bank() {

    }
    Bank(String name,int age,double balance) {
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

}