package customer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
   Scanner scan = new Scanner(System.in);
    private int acctId;
    private String customerName;
    private double accountBalance;

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    Account(){
        acctId = 0;
        customerName = null;
        accountBalance = 0;
    }



    Account(int id,String name,double balance){
        this.acctId = id;
        this.customerName = name;
        this.accountBalance = balance;
    }

    private double ValidAccountBalance() {
        return accountBalance;
    }


        public void show(){
        System.out.println(this);
    }
    


    @Override
    public String toString() {
        return "Account{" +

                "acctId=" + acctId +
                ", customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
