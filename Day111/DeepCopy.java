class DeepCopy {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 112;
        s.name = "Chotu";
        Student s1 = new Student();
        System.out.println(s.id);
        System.out.println(s1.id);//one of the Drawback of this deepCopy is that how many variables we have that many times we have assign the values
                                  //it leads to TimeConsumption is more
        
    }
}
class Student {
    int id ;
    String name;
}