package Run;

public class Main {
    public static void main(String[] args) {

        Run r = new Run();
        r.setName("Lokesh");
        r.setDistance(-12.34);
        String LongestRunner = r.getLongestRunner();
        System.out.println(LongestRunner);

        Run r1 = new Run() ;
        r1.setName("Harish");
        r1.setDistance(25.23);

        Run r3 = new Run();
        r3.setName("Kishore");
        r3.setDistance(13.34);

        String LongestRunner1 = r.getLongestRunner();
        System.out.println(LongestRunner1);
    }
}
