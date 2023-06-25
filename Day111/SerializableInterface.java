import java.io.Serializable;

public class SerializableInterface {
    public static void main(String[] args) {
        dont d = new dont();
        d.print();
        
    }
}
class dont implements Serializable{
 int a ;
 void print() {
    System.out.println("Dont think like that");
 }    
}
interface mock {

}