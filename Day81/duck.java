class duck {
    public static void main(String args[]) {
    Nord n = new Nord();
    n.rock();
    }
}
class Nord {
    {
        System.out.println("Nord Man");
    }
    void rock() {
        System.out.println("rock man!");//when ever we call this method in main function first it will prints the above block after that it will print.
    }
}