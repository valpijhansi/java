
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class dateformat {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter d = DateTimeFormatter.ofPattern("DD-MM-YY HH:mm:ss");

        System.out.println(dateTime.format(d));
        System.out.println("The date now:" + date);
        System.out.println("The time now:" + time);
        System.out.println(dateTime);
    }
}