public class Optional<S> {
    public static void main(String[] args) {
        String name = "jaanu papa";
        printtoUpperCase(name);

    }
    static void printtoUpperCase(String name) {
        if(!(name == null))
            System.out.println(name.toUpperCase());
        else
            System.out.println("It is null");
    }
}
