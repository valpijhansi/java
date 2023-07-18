import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFinder {
    private static final String LOG_FILE_PATH = "trace.log";

    public static void main(String[] args) {
        String jobName = "J1";
        String startTime = "2023-06-29 04:04:04";

        try {
            Date startDate = parseDate(startTime);
            BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 4) {
                    String logTimestamp = parts[0] + " " + parts[1];
                    String logJobName = parts[2];

                    if (logJobName.equals(jobName)) {
                        Date logDate = parseDate(logTimestamp);
                        if (logDate.after(startDate)) {
                            System.out.println(line);
                            break;
                        }
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Date parseDate(String timestamp) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(timestamp);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
