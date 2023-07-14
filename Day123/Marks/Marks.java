package Marks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Marks {
    int subject1;
    int subject2;
    int subject3;


    public Marks() {
        subject1 = 0;
        subject2 = 0;
        subject3 = 0;

    }

    public void in() {
        Scanner scan = new Scanner(System.in);


            System.out.print("Enter the marks of subject 1 : ");
            subject1 = scan.nextInt();

            System.out.print("Enter the marks of  subject 2 : ");
            subject2 = scan.nextInt();
            System.out.print("Enter the marks of subject 3: ");
            subject3 = scan.nextInt();
            validMarks();
            validMarks();



    }

    private void validMarks() {
        if((subject1 >= 0 && subject1 <=100)&&(subject2 >= 0 && subject2 <=100)&&(subject3 >=0 && subject3 <= 100)){
            System.out.println(subject1+","+subject2+","+subject3);

        }
        else {
            throw new InputMismatchException("Enter valid marks");
        }

    }


    public int Sum() {
        int result = subject1 + subject2 + subject3;
        return result;
    }

    public double Avg() {
        double res = Sum() / 3;
        return res;
    }

    private  String NumberFormat(double number) {

        String res = String.valueOf(number);

        int count = 0;

        for (int i = 0; i < res.length(); i++) {

            if (res.charAt(i) == '.') {

                for (int j = i + 1; j < res.length(); j++) {

                    char digit = res.charAt(j);

                    if (digit != '0') {
                        count++;
                        break;
                    }

                }
            }
        }

        if (count == 0) {

            return String.valueOf((int) number);

        } else {

            return String.valueOf(String.format("%.2f", number));

        }

    }
}
