import java.util.*;
class rock {
    public static void main(String args[]) {
        takeEasy te = () ->
        System.out.println("rock");

    }
}
interface Mathguy {
    int sqrt(int x);
}
abstract class Boost {
    abstract void plan();//whenever we declare a method as abstract then class also become abstarct
}
interface takeEasy {
    void joy();//here we are not write method as abstract but doesn't show an error because interface defult having abstract class jvm can take care of itself
}