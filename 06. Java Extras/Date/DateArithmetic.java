import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static LocalDate performArithmetic(LocalDate date) {
        return date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        try {
            LocalDate date = LocalDate.parse(input);
            System.out.println("Resulting date: " + performArithmetic(date));
        } catch (Exception e) {
            System.out.println("Error: Invalid date format");
        }
        scanner.close();
    }
}