public class values {
    int a = 0;
    static  int b =0;
    void rock() {
        a++;
        b++;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        values v = new values();
        values v1 = new values();
        values v2 = new values();
        v1.rock();
        v.rock();;
        v2.rock();
    }
}
