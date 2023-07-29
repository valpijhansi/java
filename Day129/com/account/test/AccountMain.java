package com.account.test;

import com.account.Account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Account accocunt = new Account();
        while (flag) {

            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display Balance");
            System.out.println("4.Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    accocunt.deposit(5000);
                    break;
                case 2:
                    accocunt.withdarw(120);
                    break;
                case 3:
                    accocunt.getBalnce();
                case 4:
                    accocunt.display();
                    break;
                case 5:
                    System.out.println("Exit ");
                    break;


                default:
                    System.out.println("Invalid Operation ");

                    return;

            }

        }

    }

}
