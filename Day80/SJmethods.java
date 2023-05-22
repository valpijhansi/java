import java.util.StringJoiner;
class SJmethods {
    public static void main(String args[]) {
        StringJoiner sj = new StringJoiner("+");
        sj.setEmptyValue("I like rose");//the set is empty then it will print this one otherwise it prints given below values 
        // sj.add("jaanu");
        // sj.add("lucky");
        // sj.add("chinnu");
        System.out.println(sj);
        System.out.println(sj.length());

    }
}