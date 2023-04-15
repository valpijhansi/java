class Staticvar {
    int x = 15;
    static double y = 25.12;

    public static void main(String args[]) {
        // System.out.println(x); it doesn't print the value because x is non-static
        System.out.println(Staticvar.y);// it is static varible that's why we can access the value as className.variable
    }

}