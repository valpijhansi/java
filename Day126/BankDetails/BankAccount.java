package BankDetails;

import java.util.Scanner;

public class BankAccount {


    Scanner sc =  new Scanner(System.in);


        private int accountNo;
        private String accountType;
        private int accountBalance;

        private  int amount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAccountDetails(int accountNo, String accountType, int amount) {
            this.accountNo = accountNo;
            this.accountType = accountType;
            this.accountBalance = amount;
        }


        public void withdraw() {
            System.out.println("Enter valid amount to withdraw: ");
            amount = sc.nextInt();
            if (amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println(amount + " withdrawn. New balance: " + accountBalance);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        public void deposit() {
            System.out.println("Enter valid deposit amount: ");
            amount = sc.nextInt();
            accountBalance += amount;
            System.out.println(amount + " deposited. New balance: " + accountBalance);
        }

        public void dispAccountDetails() {
            System.out.println(this);
        }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance+
                '}';
    }
}


