import java.util.StringJoiner;
class Duck {
    public static void main(String args[]) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("rock");
        sj.add("duck");
        sj.add("mock");
        sj.add("stone");
        System.out.println(sj);
    }
}