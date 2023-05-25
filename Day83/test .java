class test {
    public static void main(String args[]) {

        takeEasy te = () -> System.out.println("rock");
        te.joy();
    }
}
interface takeEasy {
    void joy();
}