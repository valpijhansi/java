

import java.util.Scanner;

 public class Calculator { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double first = scan.nextDouble();
        System.out.println("Enter the  second number :");
        double second = scan .nextDouble();
        System.out.println("Enter an operator(+,-,*,/,%,^):");
        char  Operation = scan.next().charAt(0);
        double ans = 0;
        switch(Operation) {
            case  '+': ans = first + second;
            break;
            case '-': ans = first - second;
            break;
            case '*': ans = first * second;
            break;
            case '/': ans  = first / second;
            break;
            case '%': ans = first % second;
            break;
            case '^': ans =  Math.pow(first, second);
            break;
            default:
            System.out.println("Invalid Operation");
            return;

        }
        System.out.println("Result: "+first+" "+Operation+" "+second+ "= "+ans);
        
    }

}