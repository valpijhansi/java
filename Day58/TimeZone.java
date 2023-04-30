import java.time.*;
import java.time.ZoneId;

class TimeZone {
    public static void main(String args[]) {
        LocalDateTime JaanujoiningDate = LocalDateTime.of(2019, 11, 8, 11, 12, 30, 121);
        LocalDateTime luckyjoiningDate = LocalDateTime.of(2020, 11, 8, 11, 12, 30, 300);
        LocalDate Jaanu = LocalDate.of(2016, 1, 5);
        var res = JaanujoiningDate.isBefore(luckyjoiningDate);
        var month = JaanujoiningDate.getMonth();
        var day = JaanujoiningDate.getDayOfWeek();
        System.out.println(Jaanu);
        System.out.println(res);
        System.out.println(month);
        System.out.println(day);
        

        for (String zones : ZoneId.getAvailableZoneIds()){
            
        System.out.println(zones);
    }
        System.out.println(Instant.now());
    }

}