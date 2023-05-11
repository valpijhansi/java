//in java every class defalutly extends from object class only
public class objectClas {

    public static void main(String[] args) {

        Rock r = new Rock();
        Object o = new Rock(); // we can create an object with parent class also
        r.mock();
        System.out.println(r.toString());// it converts an object into string
        System.out.println(r);
        System.out.println(r.getClass().getName());
        System.out.println(r.getClass()); // it returns the class

    }

}

class Rock extends Object {

    void mock() {
        System.out.println(toString());// it returns String
        System.out.println(hashCode());// it returns hascode value of the object
        System.out.println(getClass());// returns class name of the object
        System.out.println(getClass().getName());
    }

}