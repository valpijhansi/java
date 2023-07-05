import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOpertation {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5).map(e->e * 11).forEach(System.out::println);
        Stream.of("Suresh","lokesh","harish","nithisha").map(e->e.toUpperCase()).forEach(System.out::println);//the values contains in the stream are converted into UpperCase
        Stream.of("jaanu","Ramya","Radhika").map(e->e.getClass());
    }
}



