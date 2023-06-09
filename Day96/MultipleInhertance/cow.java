package MultipleInhertance;


    public interface cow {
        default void milk() {
    
            System.out.println("cow milk");
        }
    }

