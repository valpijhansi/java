import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class sortedOperation {



        public static void main(String[] args) {
            List<Student> list = Data.getStudentList();
            list.stream().limit(5).sorted(Comparator.comparingDouble(Student::rollNo)).forEach(System.out::println);

            list.stream().limit(3).sorted(Comparator.comparing(Student::name)).forEach(System.out::println);




        }
    }
    record student2(int rollNo,String name,String branch,int id) {

    }
    class data2{
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









