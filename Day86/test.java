class test {
    public static void main(String args[]) {
        Moon m = new Moon();
        m.rock().mock().duck();

    }
}
class Moon{
    Moon rock() {
        System.out.println("rock");
        return this;
    }
    Moon mock() {
        System.out.println("mock");
        return this;
    }
    void duck() {
        System.out.println("rocky");
    }
}