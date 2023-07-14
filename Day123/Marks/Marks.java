package Employee;

import java.util.Scanner;

public class employee {
    String rollNo;
    String name;
    int marks[] = new int[3];

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rollNo: ");
        rollNo = scan.next();

        System.out.println("Enter the Name: ");
        name = scan.next();

        for (int i = 0; i <marks.length; i++) {
                System.out.println("Enter the Marks of Subject: "+(i+1));
                marks[i] = scan.nextInt();

            }
        }
    }

