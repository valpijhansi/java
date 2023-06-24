class finalizedMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // s3 = null;
        // s3 = new Student();
        // System.gc();
        // Runtime.getRuntime().gc();

       
    }
}
class Student {
    Student stu;
     static int id ;
    String college;
    
    

     Student() {
         id = id+1;
        System.out.println(id);
    }

   

    @Override
    public String toString() {
        return "Student [stu=" + stu + ", id=" + id + ", college=" + college + "]";
    }
 
    
    
}