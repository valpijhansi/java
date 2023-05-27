public class GenericMethods {
    public static void main(String[] args) {

       results("lokesh", "A");

       results("jaanu", "C"); 

       results("vinay", "B");

    }

    public static<T> void results(T name, T grade) {

        System.out.println(name+"\tgrade:"+grade);
        
    }
}
