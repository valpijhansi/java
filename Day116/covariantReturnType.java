public class covariantReturnType {
    public static void main(String[] args) {
        new Rock().mania();
    }
}
class Rock {
    Rock mania() {
        System.out.println("Hey...!");
        return this;
    }
}
class Nick extends Rock {
    @Override
    Nick mania() {
        return this;
    }
}
