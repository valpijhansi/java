//Swapping four numbers without using another variable
class swapfour {
    public static void main(String args[]) {
        int a, b, c, d;
        a = 1;
        b = 3;
        c = 5;
        d = 7;
        a = a + b + c + d;
        b = a - (b + c + d);
        c = a - (b + c + d);
        d = a - (b + c + d);
        a = a - (b + c + d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}