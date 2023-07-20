package StudentMarksProject;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private static int count = 0;
    private int rollNumber;
    private String name;
    private int[] marks = new int[5];

    public Student() {
        count++;
        rollNumber = count;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter marks of 5 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void show() {
        System.out.println(this);
    }

    public static void totalStudents() {
        System.out.println("Total number of students registered: " + count);
    }

    public int totalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public int getHighest() {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        return highest;
    }

    public int getLowest() {
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        return lowest;
    }

    public double getAverage() {
        int total = totalMarks();
        return (double) total / marks.length;
    }


    public int getPassCount() {
        int passCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                passCount++;
            }
        }
        return passCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ",totalMarks " +this.totalMarks() +
                ",highestMarks " +this.getHighest() +
                ",lowestMarks " + this.getLowest() +
                ", subjects passed " + this.getPassCount()+"5" +
                '}';
    }


}