import java.util.ArrayList;
import java.util.List;

 class GenericUpperBound {
    public static void main(String[] args) {
        
        List<Flower> list = new ArrayList<>();
        
        Flower f = new Flower("Lilly");
        
        list.add(f);
        
        leaf l = new leaf("betel");
        
        list.add(l);
        
        plant p = new plant();
        
        list.add(p);
        
        System.out.println(list);



    }
    public  static void printDetails(List<? extends  Flower> t) { // for UpperBound we can use extends keyword
        
        System.out.println(t);
    }
    }
    class Flower {
        String name;

        public Flower(String name) {
            
            this.name = name;
        }
        Flower() {

        }

        @Override
        public String toString() {
            
            return name;
        }
    }
    class leaf extends Flower {
        String name;

        leaf(String name) {
            
            this.name = name;
        }
        leaf() {

        }

        @Override
        public String toString() {
            
            return name;
        }
    }
    class plant extends  leaf {
        @Override
        public String toString() {
            return "turmeric";
        }
    }