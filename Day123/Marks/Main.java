package Marks;

public class Main {
    public static void main(String[] args) {
        Marks m = new Marks();
         m.in();
        int totalMarks = m.Sum();
        System.out.println("\nSum of marks: "+totalMarks);

        double averageMarks = m.Avg();
        System.out.println("\nAverage marks: "+averageMarks);

    }
}
