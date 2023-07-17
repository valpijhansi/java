package BankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankAccount {
    Scanner scan = new Scanner(System.in);
    private String   FullName;
    private String accNum;
   private  TypeOfAccount typeOfAccount;
    private double balance;

    public String getFullName(String fname, String lname) {
        return fname + lname;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Object getName() {
        String str = " ";
        return str;
    }


    enum TypeOfAccount {
        CURRENT,SAVING;
    }
    BankAccount(){
        FullName = null;
        accNum = "";
        typeOfAccount = TypeOfAccount.SAVING;
        balance = 0;
    }



    void createAccount() {

        System.out.print("Enter first name: ");
        String fname = scan.next();
        System.out.print("Enter last name: ");
        String lname = scan.next();

        String fullName = getFullName(fname,lname);
        this.FullName = fullName;
        System.out.println(fullName);
        isvalidFullName(fname,lname);

        String accountNo = getAccountNumber();
        setAccNum(accountNo);

        String name = " ";

    }



    String getAccountNumber() {
        String accountNo = "";

        for(int i=0;i<11;i++) {
          int x = (int)  Math.floor(Math.random() * 10);
          accountNo += String.valueOf(x);
        }
        isValidAccountNum(accNum);
        return accountNo;
    }
    public void deposit() {
        System.out.println("Deposit valid amount: ");
        double amount = scan.nextDouble();

        if(isValidDepositAmt(amount)) {
            this.balance += amount;
            System.out.println("Rs. " + amount + " has been successfully deposited");
            return;
        }else
            throw new InputMismatchException("Deposit sufficient amount");
    }
    private boolean isValidDepositAmt(double amount){
        return amount>0;
    }



    public void withdarw() {
        System.out.println("Please enter amount how much you want: ");

        double amount = scan.nextDouble();

        if(isValidWithdrawAmount()) {

            System.out.println("Enter valid withdrawal amount");
            return;
        }
        if(isValidWithdrawAmount()){
            System.out.println("Amount is not sufficient");
            return;
        }
        this.balance -= amount;
        System.out.println("Your transaction is successful..!");




    }
    private boolean isValidWithdrawAmount(){
        return this.getBalance()<=0;
    }

    public void display() {

        System.out.println(this);
    }




    public boolean isvalidFullName(String fName,String Lname) {

        String str1= "[A-Za-z]+";
        String str2 ="[A-Za-z]+";

        if (Pattern.compile(str1).matcher(fName).matches() && Pattern.compile(str2).matcher(Lname).matches())
            return true;
        return false;

    }
    


    public boolean isValidAccountNum(String accontNum) {
        System.out.println("Enter your account num: ");
        accontNum = scan.next();
        this.accNum = accontNum;

        String str = "[A-Z]{4}[0-9]{7}";
        if (Pattern.compile(str).matcher(accNum).matches())
            return true;
        return false;

    }


    @Override
    public String toString() {
        return "BankAccount{" +

                ", FullName='" + FullName + '\'' +
                ", accNum='" + accNum + '\'' +
                ", typeOfAccount=" + typeOfAccount +
                ", balance=" + balance +
                '}';
    }
}
