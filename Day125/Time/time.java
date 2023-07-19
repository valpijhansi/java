package Time;



public class time {

    private int hours;
    private int minutes;
    private int seconds;

    public time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

    }

    public time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        if (seconds > 59) {
            this.seconds = this.seconds % 60;
            this.minutes += seconds / 60;
        }
        if (minutes > 59) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
        if (this.hours > 11) {
            this.hours = this.hours % 12;

        }
    }

    public void display() {
        String formatTime = getFormattedTime();
        System.out.println(formatTime);

    }

    public String getFormattedTime() {
        String hour = String.format("%02d", hours);
        String minute = String.format("%02d", minutes);
        String second = String.format("%02d", seconds);
        return hour + ":" + minute + ":" + second;
    }
}

