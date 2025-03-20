import java.util.Scanner;

public class DivisionCalculator {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int number = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            System.out.println("Invalid divisor.");
            System.exit(0);
        }

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);

        scanner.close();
    }
}