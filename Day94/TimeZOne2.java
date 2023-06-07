import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

class TimeZOne2 {
    
    public static void main(String args[]) {
        Locale[] locales = Calendar.getAvailableLocales();
       
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(Calendar.getInstance(Locale.CANADA).getTime());
        TimeZone tz = TimeZone("America/Las_Angeles");
        System.out.println(tz);

        TimeZone time_zone = TimeZone("Africa/Algiers");
        c.setTimeZone(time_zone);
        
        System.out.println(c);

        String [] ids = TimeZone.getAvailableIDs();
        for(var x : ids)
        System.out.println(x);
        c.setTimeZone(time_zone);
        System.out.println("Modified zone :"+ c.getTimeZone().getDisplayName());





    }

    private static TimeZone TimeZone(String string) {
        return null ;
    }

    
}