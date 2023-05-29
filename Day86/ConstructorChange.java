class ConstructorChange {
    public static void main(String args[]) {
    Fun f = new Fun(11);
    }
}
class Fun {
    Fun() {
        this(11);
        System.out.println("first");
    }
    Fun(int rating) {
        this(11,12);
        System.out.println("second");
    }
    Fun(int x,int y) {
        this("rocky",17);
        System.out.println("third");
    }
 
    Fun(String name, int blast) {
    System.out.println("last");
    }   
}