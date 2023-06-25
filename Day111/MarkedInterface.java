class MarkedInterface {
    public static void main(String[] args) {

        SBI s = new SBI();
        if(s instanceof RBI) {
            System.out.println("Allow Operations to be perform in india");
        } else {
            System.out.println("Take approval from RBI");
        }
        
    }
}
class SBI implements RBI {
    int a ;
    void print(){
        System.out.println("Follw the guidelines of RBI");
    }
}
interface RBI {

}