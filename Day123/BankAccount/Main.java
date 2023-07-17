package BankAccount;

import java.util.Objects;
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

            switch (choice) {
                case 1:
                    ba.createAccount();
                    break;
                case 2:
                    if (ba.getName().equals("")) {
                        printErrorMsg();
                    } else
                        ba.deposit();
                    break;

                case 3:

                    if (ba.getName().equals(""))
                        printErrorMsg();
                    else
                        ba.withdarw();
                    break;
                case 4:
                    if (ba.getName().equals("")) {
                      printErrorMsg();
                    } else
                        ba.display();

              case 5:
                  System.out.println("Exit");
                  break;


                default:
                    System.out.println("Invalid Operation ");
                    return;

            }

        }

    }
    private static void printErrorMsg(){
        System.out.println("First create an account:");
    }
}
