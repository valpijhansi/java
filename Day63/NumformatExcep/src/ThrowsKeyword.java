

public class ThrowsKeyword {
    static int area(int l, int b) throws Exception { //throw can be used to declare an exception
        if (l < 0 || b < 0)
            throw new Exception("length and breadth are not negative");//throw keyword can be used to throw an exception explicitly
        return l * b;

    }

    static void test() throws Exception {
        System.out.println("Area is:" + area(-12, 6));
    }

    public static void main(String[] args) throws Exception{

            test();


        }
    }
