//every class in java IS_A object.
public class overrideMethod {

    public static void main(String[] args) {

        Mock m = new Mock();

        System.out.println(m);

        System.out.println(m.toString());

    }

    static class Mock extends Object { // we know that every class in java child class of object class

        @Override

        public String toString() {

            return "JaanuBangaram";
        }
    }
}