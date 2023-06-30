public class StrictFp {
    public strictfp double sum()
        {

            double num1 = 10e+10;
            double num2 = 6e+08;
            return (num1 + num2);
        }


        public static void main(String[] args)
        {
            StrictFp strictFp = new StrictFp();
            System.out.println(strictFp.sum());
        }
    }

