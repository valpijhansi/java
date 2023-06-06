
import java.util.*;

class TimeZone {
    public static void main(String args[]) {
        Calendar c = Calender.getInstance(Locale.TAIWAN);
        System.out.println(c.getTime());
        Rock.rock();
    }
}
abstract class Rock {
    abstract void nick();
    static void rock() {
        System.out.println("Rock");
    }
}
