//ClassCast Exception is a runtime Exception that occurs when the application code attempts to cast an object to another class of which the originla object is not an instance.
//EX:a String object cannot be cast to an Integer object.
public class ClassCastException {
    public static void main(String[] args) {
        Trees t = new Trees();
        Fruits f = new Fruits();
        Fruits x = (Fruits) t;

    }
}
class Trees {

}
class Fruits extends Trees {

}
