class CloneCopy {
    public static void main(String[] args) throws CloneNotSupportedException  {
       student s = new student();
       s.id = 113;
       s.name = "Jaanu";

       student s1 = (student) s.clone();

       System.out.println(s1.id);
       System.out.println(s1.name);
        
    }
}
class student implements Cloneable {
    int id ;
    String name;
    void print() {
        System.out.println("Hey.................!");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}