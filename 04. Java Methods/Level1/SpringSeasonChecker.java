import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) ||
               (month == 4 && day >= 1 && day <= 30) ||
               (month == 5 && day >= 1 && day <= 31) ||
               (month == 6 && day >= 1 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            System.exit(0);
        }

        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Invalid day.");
            System.exit(0);
        }

        System.out.println(isSpringSeason(month, day) ? "It's a spring season" : "It's not a spring season");

        scanner.close();
    }
}