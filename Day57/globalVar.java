class globalVar {
    public static void main(String[] args) {
        int x;//global  variables once we declare we can access that anywhere
        int y;
        globalVar gv = new globalVar();
        System.out.print(gv.sum(12, 13));
    }

    public int sum(int x, int y) {
        return x + y;
    }
}