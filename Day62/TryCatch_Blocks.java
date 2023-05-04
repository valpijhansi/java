import java.util.*;

class TryCatch_Blocks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[1];
        try { // in a single try block we can write multiple catch blocks
            int y = 5 / sc.nextInt();
            int x = a[12];
            System.out.println("Inside the try block");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("out of bound exception"); // ----------> when ever we give index greater then actual one
                                                          // then it shows index out of bounds exception

        } catch (ArithmeticException e) { // --------> what ever we give Syntactically correct but logically not correct
                                          // then it will shows ArithmeticException

            System.out.println("Arithmetic exception");

        } catch (InputMismatchException e) { // ----> it is expecting integer but we can give any other like
                                             // String,double
            // input then it will shows inputMismatchException
            System.out.println("not found exception");
        }
    }

}
