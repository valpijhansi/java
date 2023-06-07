//The @Deprecated annotation indicates that a marked class,method, or field is 'deprecated' and they are no longer in use.
//The Compiler gives a warning message whenever there is a use of deprecated class,method or field marked with the @Deprecated annotation in the program.

class DeprecatedAnotation {
    public static void main(String args[]) {
        Add a = new Add();
        a.Add(30,60);
    
    }
}
class Add {
//    Add(int a,int b)
//    {
//     System.out.println(a+b);
//    }
    @Deprecated
    static void Add(int a,int b) {
        System.out.println(a+b);
    }
    static void AddNew(double a,double b) {
        System.out.println(a+b);

    }
}