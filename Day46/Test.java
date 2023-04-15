class Test {
    public static void main(String args[]) {
        NetWorth p = new NetWorth();
        NetWorth s1 = new NetWorth();
        p.sellProperty(1000);//when ever we call this method the x value will be 1201000
        s1.capicono();
        p.collegeFees(100000);

        System.out.println(NetWorth.getFamilyNetworth());
        System.out.println(NetWorth.x);

    }

}

class NetWorth {
    static int x = 1200000;

    void capicono() {
        System.out.println(x -= 100);
    }

    void sellProperty(int value) {
        System.out.println(x += value);
    }

    static int getFamilyNetworth() {
        return x;
    }

    int collegeFees(int tier) {
        if (tier == 1)
            x -= 10000;
        else if (tier == 2)
            x -= 100000;
        else if (tier == 3)
            x -= 30000;
        else
            x -= 50000;
        return x;
    }
}