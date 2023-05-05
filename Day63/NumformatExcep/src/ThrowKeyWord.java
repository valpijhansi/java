public class ThrowKeyWord {
    static int Eligible(int rank) {
       if(rank>1000)
           throw new ArithmeticException("person not eligible to get seat");
      return rank;

    }

    static void test()  {
        System.out.println("Rank is:"+Eligible(1550));
    }

    public static void main(String[] args) {
         {
            test();
        }
    }
}