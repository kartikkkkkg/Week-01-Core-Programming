import java.util.Scanner;

public class CalendarDisplay {
    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m0) / 12) % 7;
    }

    public static void printCalendar(int month, int year) {
        int days = DAYS_IN_MONTH[month - 1];
        if (month == 2 && isLeapYear(year)) days = 29;
        int startDay = getFirstDayOfMonth(month, year);
        System.out.println("\n  " + MONTHS[month - 1] + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        for (int i = 0; i < startDay; i++) System.out.print("     ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%5d", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        printCalendar(month, year);
        scanner.close();
    }
}