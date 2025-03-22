import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatter {
    public static void displayFormats(LocalDate date) {
        DateTimeFormatter[] formatters = {
            DateTimeFormatter.ofPattern("dd/MM/yyyy"),
            DateTimeFormatter.ofPattern("yyyy-MM-dd"),
            DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")
        };
        for (DateTimeFormatter formatter : formatters) {
            System.out.println(date.format(formatter));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("Current date in different formats:");
        displayFormats(today);
        scanner.close();
    }
}