import java.util.ArrayList;
import java.util.List;

public class mapOperationEx {



        public static void main(String[] args) {
            List<Student> list = Data.getStudentList();
          list.stream().limit(4).map(Student::name).forEach(System.out::println);
          list.stream().map(Student::branch).forEach(System.out::println);


        }
    }
    record Student1(int rollNo,String name,String branch) {

    }
    class Data1 {
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







