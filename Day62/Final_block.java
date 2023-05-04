import java.util.*;

class Final_block {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[0];
        try {
            int y = 5 / sc.nextInt();
            int x = a[12];
            System.out.println("Inside the try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bound exception");
        } finally {
            System.out.println("try and block done properly or not");//what ever we get exception the final block will execute successfully
        }
    }
}