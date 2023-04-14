class Interface2 {
    public static void main(String args[]) {
        X r = new R();
        r.joy();

    }
}

interface X {
    public void joy();
}

class R implements X {
    public void joy() {
        System.out.println("Joyful Man");
    }
}