import java.time.LocalDate;
import java.util.Scanner;

public class DateComparator {
    public static String compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) return "First date is before second date";
        if (date1.isAfter(date2)) return "First date is after second date";
        return "Dates are equal";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String input2 = scanner.nextLine();
        try {
            LocalDate date1 = LocalDate.parse(input1);
            LocalDate date2 = LocalDate.parse(input2);
            System.out.println(compareDates(date1, date2));
        } catch (Exception e) {
            System.out.println("Error: Invalid date format");
        }
        scanner.close();
    }
}