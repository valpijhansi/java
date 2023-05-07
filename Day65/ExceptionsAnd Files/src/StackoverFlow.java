//StackOverFlow is an error which java doesn't allow to catch,for instance stack running out of sapce .
//when ever we haven't provide proper terminating condition this error may get.
public class StackoverFlow {
    public static void main(String[] args) {
        rock();
    }
    public static void rock() {
        rock();//we can get here StackOver flow Error
                //Actually we cannot handle this Error
    }
}
