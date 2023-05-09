public class VarKeyWord {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(rock());
        int a[] = {1,2,3,4};
        for(var i:a)
            System.out.print(i);

    }
    static {
        var x =13;//value can be declared in same line only otherwise it shows an error
                    //the first it will check for local variable if there is no such variable then static one can be printed
        System.out.println(x);
    }
    static String rock() {
        var x = "12";
        return x;

    }
}
