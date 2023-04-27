class College {

    public void CSE() {
        System.out.println(" this is computer science");
            college();
    }

    public void ECE() {
        System.out.println(" this is electronics");
            college();
    }

    public void IT() {
        System.out.println(" this is IT");
            college();

    }

    public void college() {
        System.out.println("IIT - Madras");
    }

    public static void main(String args[]) {
        College c = new College();
        c.CSE();
        c.ECE();
    }
}