package DebuggingTech;

public class AssertionExample {
    public static void main(String[] args) {
        String[] days = {
                "Mon",
                "Tue",
                "Wed",
                "Thu",
                "Fri",
                "Sat",
                "Sun"
        };
        assert days.length == 6 : "There are only 6 days in a week";
        System.out.println("There are "+days.length+" days in a week");
    }
}
