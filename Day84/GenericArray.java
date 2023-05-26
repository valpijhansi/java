import java.util.*;
class GenericArray {
    
        public static void main(String args[]) {
            weight<Integer> lucky = new weight<>(123);
            lucky.addWeights(2,54.5f);
            lucky.addWeights(1,59.5f);
            lucky.addWeights(3,60.5f);
            System.out.println(lucky);

    
        }
    }

class weigth<E> {
    Object[] mass;
    public void Weight() {
        mass = new Object[10];
    }
    void addWeights(int ind,E masss) {
        mass[ind] = masss;
    }
    public String toString(){
        return "Weight"+
                "mass" + Arrays.toString(mass);
                
            
    }
}