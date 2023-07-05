package person1.java;

class Person {
    public static void main(String[] args) {
        student s1 = new student();
        s1.college = "Fun";
        s1.id = 112;
        System.out.println(s1);
        
    }
}
class student {
    int id;
    String college;
    @Override
    public String toString() {
        return "Student [id=" + id + ", college=" + college + "]";
    }

}