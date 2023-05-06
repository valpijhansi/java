public class NullPointerExcep {
    public static void main(String[] args) {
        Duck d = new Duck();
        String s1 = null;
        System.out.println(s1.length());//cannot invoke String.length() because s1 is null
        System.out.println(d.x);//This will not execute because the above line rise Exception so that execution stops there only.


    }
}
class Duck {
    String s = "";
    int x ;
}
