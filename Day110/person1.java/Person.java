class Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.college = "Fun";
        s1.id = 112;
        System.out.println(s1);
        
    }
}
class Student {
    int id;
    String college;
    @Override
    public String toString() {
        return "Student [id=" + id + ", college=" + college + "]";
    }

}