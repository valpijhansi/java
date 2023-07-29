package com.account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private  int accountID;
    private double accountBalance;
    private typeOfAccount TypeofAccount;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public typeOfAccount getTypeofAccount() {
        return TypeofAccount;
    }

    public void setTypeofAccount(typeOfAccount typeofAccount) {
        TypeofAccount = typeofAccount;
    }


    private int ValidAccountID(){
        boolean value = false;
        int id;
        do{
            System.out.println("Enter the AccountId: ");
            id = sc.nextInt();
            if(id>0){
                value = true;
            }
            if(value);
            else{
                System.out.println("Enter valid ID: ");
            }

        }while(!value);
        return id;
    }

    private double ValidAmount() {
        boolean res = false;
        double amount;

        do {
            System.out.println("Enter the valid balance: ");
            amount = sc.nextDouble();
            if(amount>0){
                res = true;
            }
            if(res);
            else{
                System.out.println("Please Enter the valid amount: ");
            }


        }while (!res);
        return amount;
    }

    public Account(){
        this.accountID = ValidAccountID();
        this.accountBalance = ValidAmount();
        this.TypeofAccount = typeOfAccount.SAVINGS;
    }
    public void deposit(int accountBalance) {
        System.out.println("Deposit valid amount: ");
        double amount = sc.nextDouble();

        if(isValidDepositAmt(amount)) {
            this.accountBalance +=amount;
            System.out.println("Rs. " + amount + " has been successfully deposited");
        }else
            throw new InputMismatchException("Deposit sufficient amount");
    }
    private boolean isValidDepositAmt(double amount){
        return amount>0;
    }
    public void withdarw(int accountBalance){
        System.out.println("Please enter amount how much you want: ");

        double amount = sc.nextDouble();

        if(isValidWithdrawAmount()) {

            System.out.println("Enter valid withdrawal amount");
            return;
        }
        if(isValidWithdrawAmount()){
            System.out.println("Amount is not sufficient");
            return;
        }
        this.accountBalance -=amount;
        System.out.println("Your transaction is successful..!");




    }
    public int getBalnce() {
        double Amount;
        boolean res = false;
        do {
            try {
                System.out.println("Enter the amount: ");
                Amount = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter the valid Balnce:");
                Amount = sc.nextDouble();
            }
            if(res);
            else{
                System.out.println("Enter the sufficient balance:");
                Amount = sc.nextDouble();
            }
        }while(!res);
        return (int) Amount;
    }
    private boolean isValidWithdrawAmount(){
        return this.getAccountBalance()<=0;
    }


    public void display(){
    System.out.println(this);

    }

    @Override
    public String toString() {
        return "Account{" +

                " accountID=" + accountID +
                ", accountBalance=" + accountBalance +
                ", TypeofAccount=" + TypeofAccount +
                '}';
    }
}
