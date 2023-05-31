import java.util.Arrays;

class University {
    public static void main(String args[]) {
        College c = new College();
        c.setName("SVUCM&Cs");
        c.setDept("MCA");
        c.setDeptNo(129);
        c.setNumOfBranches(1);
        c.setNumOfStudents(113);

        Student s = new Student();
        s.setName("Jhansi");
        s.setDept("MCA");
        s.setBranch("CA");
        s.setRollNo("S0123");
        
        Student[] students = {s};
        c.setStudent(students);

        studentResults sr = new studentResults();
        sr.setSname("Jhansi");
        sr.setSid(123);
        sr.setResult("A grade");

        studentResults sr1 = new studentResults();
        sr.setSname("Ramya");
        sr.setSid(124);
        sr.setResult("O grade");

        studentResults[] results ={sr,sr1};
        c.setstudentResults(results);

        Employees e = new Employees();
        e.setEname("Swathi");
        e.setEdept("McA");
        e.setSalary(20000);

        Employees e1 = new Employees();
        e1.setEname("Rani");
        e1.setEdept("MBA");
        e1.setSalary(30000);

        Employees[] employees = {e,e1};
        c.setEmployees(employees);

        System.out.println(c);

    }
}
class College {
    String name;
    String Dept;
    int DeptNo;
    int numOfBranches;
    int NumOfStudents;
    private Employees[] employees;
    private studentResults[] results;
    private Student[] students;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return Dept;
    }
    public void setDept(String dept) {
        Dept = dept;
    }
    public int getDeptNo() {
        return DeptNo;
    }
    public void setDeptNo(int deptNo) {
        DeptNo = deptNo;
    }
    public int getNumOfBranches() {
        return numOfBranches;
    }
    public void setNumOfBranches(int numOfBranches) {
        this.numOfBranches = numOfBranches;
    }
    public int getNumOfStudents() {
        return NumOfStudents;
    }
    public void setNumOfStudents(int numOfStudents) {
        NumOfStudents = numOfStudents;
    }
    public void setEmployees(Employees[] employees) {
        this.employees = employees;
    }
    public void setstudentResults(studentResults[] results) {
        this.results = results;
    }
    public void setStudent(Student[] students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "College [name=" + name + ", Dept=" + Dept + ", DeptNo=" + DeptNo + ", numOfBranches=" + numOfBranches
                + ", NumOfStudents=" + NumOfStudents + ", employees=" + Arrays.toString(employees) + ", results="
                + Arrays.toString(results) + ", students=" + Arrays.toString(students) + "]";
    }

}