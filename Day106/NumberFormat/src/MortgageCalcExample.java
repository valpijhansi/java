import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalcExample {
     static final byte MONTHS_IN_YEAR = 12;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Principal: ");
            int p = sc.nextInt();

            System.out.print("Annual Interest Rate: ");
            float yearlyRate = sc.nextFloat();
            float monthlyRate = yearlyRate/100/MONTHS_IN_YEAR;//no Of Months in a year is a constant it never changed

            System.out.print("Time Frame (In Years) : ");
            byte years = sc.nextByte();
            short noOfPayments = (short) (years * MONTHS_IN_YEAR);

            double mortagage = p *(monthlyRate * Math.pow((1+monthlyRate),noOfPayments))/ (Math.pow((1+monthlyRate),noOfPayments)-1);

            String formatedMonthlyAmount = NumberFormat.getInstance().format(mortagage);
            System.out.println("Monthly Amount:"+formatedMonthlyAmount);


        }
    }


