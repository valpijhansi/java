import java.util.*;
class Calendar1 {
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();
        int max = c.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum no.Of days in a week : "+max);
        
        max = c.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum no.of weeks in a year : "+max);

        int min = c.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum no. of days in a week : "+min);

        c.add(Calendar.MONTH,5);
        System.out.println("5 months later" + c.getCalendarType());
        System.out.println("5 Months later: "+c.getTimeZone());
        
        c.add(Calendar.DATE,-20);
        System.out.println("20 days ago:"+c.getTime());
    }
}