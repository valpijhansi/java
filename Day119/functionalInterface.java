// * In a functional interface we have conations only one abstract method and many default methods
// * we can extends an interface in an another interface
// * but it is not possible to implement one inetrface within the another one

public class functionalInterface {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface duck{
    void rock();

}
interface  cow extends duck{
    void done();
}
