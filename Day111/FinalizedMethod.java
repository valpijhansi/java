public class FinalizedMethod {
    public static void main(String[] args) {
        Rock rock = new Rock();
        rock = null;
        System.gc();//Explicitly Call the garbage collector
    }
    
}

class Rock {
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}
