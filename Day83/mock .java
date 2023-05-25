class mock {
    public static void main(String args[]) {
    takeEasy te = (a,b) -> {
        return a+b;
    };
    int res = te.joy(5,6);
    System.out.println(res);
    }
}
interface takeEasy {
    int joy(int x,int y);
}