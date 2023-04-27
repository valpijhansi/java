
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


class date {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The date now:"     + date);
        System.out.println("The time now:"+time);
        System.out.println(dateTime);
    }
}