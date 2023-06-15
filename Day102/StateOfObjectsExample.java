import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StateOfObjectsExample {
    public static void main(String[] args)throws Exception {
        FileInputStream fi  = new FileInputStream("rock.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
        System.out.println(fi.read());
        SBI si = new SBI();


    }


}
class SBI {
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

    SBI() {

    }
    SBI(String name) {
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

