 public class FinalizedMethod {
    public static void main(String[] args) throws Throwable {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.finalize();

        s3 = null;
        s3 = new Student();
        System.gc();
        Runtime.getRuntime().gc();

       
    }
}
class Student {
    static int id ;
     Student stu;
    String college;
    
    

     Student() {
         id = id+1;
        System.out.println(id);
    }
     protected void finalize() throws Throwable {
        try {
 
            System.out.println("Hello papa....!");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class");
 
           
        }
    }

   

    @Override
    public String toString() {
        return "Student [stu=" + stu + ", id=" + id + ", college=" + college + "]";
    }
 
    
    
}