import Library.Book;
import Libraray.Employees.Staffing;
import Libraray.Employees.nonStaffing;
import Library.Branch;


 public class main {
    public static void main(String args[]) {
        Book b = new Book();
        b.setBookName("Advanced Java");
        b.setAuthourName("Raoul-Gabriel Urma");
        b.setBookNo("A1026B");
        b.setNumOfBooks(12);

        Branch br = new Branch();
        br.setName("Computer Science");
        br.setCode("09123A");
        br.setTypeOfBooks("Software Engineering,OS,Java,DSA");
        br.setNumOfBooks(15);

        Staffing s = new Staffing();
        s.setEname("Raju");
        s.setEmpType("Full_time");
        s.setQualification("Graduation");
        s.setTypeWork("Mantaining the data realating to books ");
        s.setSalary(20000);

        Staffing s1 = new Staffing();
        s.setEname("Kavya");
        s.setEmpType("Part-time");
        s.setQualification("Graduation");
        s.setTypeWork("Arranging the books according to subject wise");
        s.setSalary(15450);

        nonStaffing ns = new nonStaffing();
        ns.setName("kiran");
        ns.setQualification("10th");
        ns.setWorktype("receptionist");
        ns.setSalary(12200);

        System.out.println(b);
        System.out.println(br);
        System.out.println(s);
        System.out.println(ns);
         
        

    }
}