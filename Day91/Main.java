class Main{
    public static void main(String args[]) {
        System1.out.println("JaanuLoki");

    }
}
class System1 {
    static PrintStream1 out = null;
}
class PrintStream1 {
    static void println(String str) {
        System.out.println(str);
    }
}