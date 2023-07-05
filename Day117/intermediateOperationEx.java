import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class intermediateOperationEx {

        public static void main(String[] args) {
            List<Student> list = Data.getStudentList();
           list.stream().limit(3).forEach(System.out::println);//According to this it can print only three values from the list
            

        }
    }
    record Student(int rollNo,String name,String branch) {

    }
    class Data {
        public static List<Student> getStudentList() {
            List<Student> list = new ArrayList<>();
            list.add(new Student(1,"Suresh","CSE"));
            list.add(new Student(2,"Somesh","MEC"));
            list.add(new Student(3,"Mukesh","CVI"));
            list.add(new Student(4,"Rajesh","CSE"));
            list.add(new Student(5,"Rakesh","MEC"));
            list.add(new Student(6,"Lokesh","CVI"));
            list.add(new Student(7,"kishore","MEC"));
            return list;
        }
    }



