package Student;

public class studentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setStudDetails(121,"Jhansi",65,78,90);
        s1.setStudDetails(121,"Haritha",45,67,89);

        s1.displayStudDetails();
        s1.calculateTotal();
    }
}
