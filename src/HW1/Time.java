package HW1;

public class Time {
    public static void main(String [] args) {
        int hour = 19;
        int minute = 34;
        int second = 25;
        int sec_since = (second + (minute*60) + (hour*3600));
        System.out.println("19:34:25 is " + sec_since + " seconds since midnight.");

        int sec_remain = (86400 - sec_since);
        System.out.println("There are " + sec_remain + " seconds remaining.");

        int percent = ((sec_since*100)/86400);
        System.out.println(percent + "% of the day has elapsed.");

    }
}
