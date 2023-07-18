package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the car name: ");
        String carName = scan.nextLine();
        car. isvalidName(carName);


        System.out.print("Enter the car direction (E, W, N, S): ");
        String carDirection = scan.nextLine();

        System.out.print("Enter the car position: ");
        int Position = scan.nextInt();
        car.isValidPosition();

        car c = new car(carName, carDirection, Position);

        int choice = 0;

        while (choice != 5) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Show car details");
            System.out.println("2. Turn the car ");
            System.out.println("3. Turn the car to a specific direction");
            System.out.println("4. Move the car");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    c.show();
                    break;
                case 2:
                    c.turn();
                    System.out.println("Car turned.");
                    break;
                case 3:
                    scan.nextLine();
                    System.out.print("Enter the new direction: ");
                    String newDirection = scan.nextLine();
                    c.turn(newDirection);
                    System.out.println("Car turned to " + newDirection);
                    break;
                case 4:
                    System.out.print("Enter the distance to move: ");
                    int distance = scan.nextInt();
                    c.move(distance);
                    System.out.println("Car moved " + distance + " units.");
                    break;
                case 5:
                    System.out.println("Exiting the process.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }

    }
}
