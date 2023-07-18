package TollGate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        tollGate tg = new tollGate();
        int choice = 0;

        while (choice != 4) {
            System.out.println("Tollbooth Menu:");
            System.out.println("1. Car paying toll");
            System.out.println("2. Car not paying toll");
            System.out.println("3. Display totals");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tg.payingCar();

                    System.out.println("Car paid toll.");
                    break;
                case 2:
                    tg.noPayingCar();
                    System.out.println("Car passed without paying toll.");
                    break;
                case 3:
                    tg.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }


    }
        }






