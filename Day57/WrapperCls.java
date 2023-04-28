import java.lang.*;

class Wrapper {
    public static void main(String args[]) {
        Integer age = new Integer(12);
        int k = age;
        Integer weight = k + 10; // we can also combine primitive data type with Wrapper
        Float res = Float.parseFloat("123123");
        int result = Integer.min(12,14);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(res);
        System.out.println(Integer.toBinaryString(9381));
    }
}