import java.util.*;

class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// whenever we run this program it is waiting for give the values a,b.
        int b = sc.nextInt();// once we give the values then it prints the result.
        String s = sc.next();
        String s1 = sc.nextLine();// the nextLine() method can read the input till the end of line
        System.out.println(a + b + " " + s);// this will print the actual output
        System.out.println(a + b + " " + s1);//here it prints out put as value of a+b that will store in empty string that is s1.
    }
}
