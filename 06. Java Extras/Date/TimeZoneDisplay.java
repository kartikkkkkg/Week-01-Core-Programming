import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneDisplay {
    public static void displayTimes() {
        String[] zones = {"GMT", "Asia/Kolkata", "America/Los_Angeles"};
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        for (String zone : zones) {
            ZonedDateTime time = ZonedDateTime.now(java.time.ZoneId.of(zone));
            System.out.println(zone + ": " + time.format(formatter));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current times in different zones:");
        displayTimes();
        scanner.close();
    }
}