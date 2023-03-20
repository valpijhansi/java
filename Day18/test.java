class test {
    int x = 10;

    void modify(int x) {
        x = x + 50;
        System.out.println("value after modify:" + x);

    }

    public static void main(String args[]) {
        test t = new test();
        t.modify(t.x);
        System.out.println("original value:" + t.x);

    }
}
