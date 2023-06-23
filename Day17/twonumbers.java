//Swaping two numbers without using another variable.
class Twonumber1 {
    public static void main(String args[]) {
        int a, b;
        a = 7;
        b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}