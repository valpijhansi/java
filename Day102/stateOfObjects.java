import java.io.*;

public class stateOfObjects {
    public static void main(String[] args) throws Exception {
        FileOutputStream fi = new FileOutputStream ("rock.txt");
        PrintStream po = new PrintStream(fi);
        DataOutputStream dos =  new DataOutputStream(fi);
        HDFC rock = new HDFC("Lokesh");
        rock.setBalance(6444.00);
        rock.setMinimumBal(3000);
        po.println(rock.getName());
        po.println(rock.getBalance());
        po.println(rock.getMinimumBal());


    }
}
class HDFC {
    public int getMinimumBal() {
        return MinimumBal;
    }

    public void setMinimumBal(int minimumBal) {
        this.MinimumBal = minimumBal;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    HDFC() {

    }
    HDFC(String name) {
        this.name = name;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double balance;
    int MinimumBal;
}
