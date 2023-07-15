package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        while (flag) {
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                ba.createAccount();
            } else if (choice == 2) {
                if (ba.getName().equals(""))
                    System.out.println("Create an account");
                else
                    ba.deposit();

            } else if (choice == 3) {
                if (ba.getName().equals(""))
                    System.out.println("First create an account");
                else
                    ba.withdarw();
            } else if (choice == 4) {
                if (ba.getName().equals(" "))
                    System.out.println("First create an account");
                else
                    ba.display();
            }


        }
    }
}
