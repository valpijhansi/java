import java.util.*;


class UnBounded{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("rani","vani","vinni","chinnu");

        System.out.println(list);

        List<Double> list1 = new LinkedList<>();

        list1.add(45.98);

        list1.add(83.23);

        list1.add(10.5);
        
        System.out.println(list1);
    }

    public static void numbers(List<?> x) {

        System.out.println(x);
    }
}