//public  class Main {
//    public static void main(String[] args) {
//        for (int i=128;i<256;i++) {
//            byte temp = (byte) i;
//            System.out.println(temp);
//        }
//    }
//}
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final  byte MONTHS_IN_YEAR = 12;
        final  byte PERCENT = 100;
        int p;
        float monthlyRate ;
        short noOfPayments;



        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Principal: ");
            p = sc.nextInt();
            if(p>=1000 && p <= 1000000000)
                break;
            System.out.println("Enter the value between 1000 and 10000000");
        }
        while(true) {
            System.out.print("Annual Interest Rate: ");
            float yearlyRate = sc.nextFloat();
            if (yearlyRate >= 1 && yearlyRate <= 48) {
                monthlyRate = yearlyRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
        }

        while(true){
            System.out.println("Time Frame(In years) :");
            byte years = sc.nextByte();
            if(years>=1 && years<=30) {
                noOfPayments = (short) (years * MONTHS_IN_YEAR);
                break;
            }
            System.out.println("Enter the value between 1 nad 30");

        }

        double mortagage = p *(monthlyRate * Math.pow((1+monthlyRate),noOfPayments))/ (Math.pow((1+monthlyRate),noOfPayments)-1);

        String formatedMonthlyAmount = NumberFormat.getInstance().format(mortagage);
        System.out.println("Monthly Amount:"+formatedMonthlyAmount);


    }
}

