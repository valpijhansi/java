import java.text.NumberFormat;
import java.util.Scanner;




    public class refactoringCodeEx {
        private static byte MONTHS_IN_YEAR;
        public static void main(String[] args) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;
//            int p;
//            float monthlyRate ;
//            short noOfPayments;
            int princical = (int) readInput("Principal", 1000, 1000000000);
            float annualRate = (float) readInput("Annual interest rate", 1, 48);
            float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
            byte years = (byte) readInput("Time (in years)", 1, 30);
            short noOfPayments = (short) (years * MONTHS_IN_YEAR);

            double mortgage = princical * (monthlyRate * Math.pow((1 + monthlyRate), noOfPayments)) / (Math.pow((1 + monthlyRate), noOfPayments) - 1);
            String formatedMonthlyAmount = NumberFormat.getInstance().format(mortgage);
            System.out.println("Monthly Amount : " + formatedMonthlyAmount);


        }

        public static double readInput(String str, int min, int max) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println(str + ": ");
                double value = sc.nextDouble();
                if (value >= min && value <= max) {
                    return value;

                }
                System.out.print("Enter a value between " + min + " and" + max);
            }
        }
        public static float getMonthlyRate(float annualRate,byte PERCENT,byte MONTHS_IN_YEAR) {
            float monthlyRate = annualRate/PERCENT/MONTHS_IN_YEAR;
            return monthlyRate;
        }
        public static short getNumOfPayments(byte years) {
           return(short)(years * MONTHS_IN_YEAR);
        }
        public static double findMortgage(int princical,float monthlyRate,short noOfPayments) {
            
            double mortgage = princical * (monthlyRate * Math.pow((1 + monthlyRate), noOfPayments)) / (Math.pow((1 + monthlyRate), noOfPayments) - 1);
            return mortgage;
        }
    }




