import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("Invalid year.");
            System.exit(0);
        }

        System.out.println(year + " is " + (isLeapYear(year) ? "" : "not ") + "a leap year");

        scanner.close();
    }
}