import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadingTheData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            String custName = sc.next();

            FileInputStream fis = new FileInputStream("customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int len = ois.readInt();
            Bank list[] = new Bank[len];

            for(int i=0;i<len;i++) 
            list[i] = (Bank)ois.readObject(); 

            for(Bank cust : list) {
                if(cust.name.equalsIgnoreCase(custName))  
                System.out.println(cust.balance);
            }
            ois.close();
            fis.close();


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}