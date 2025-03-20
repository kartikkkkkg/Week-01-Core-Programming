import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumNaturalNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        System.out.println("Sum of first " + number + " natural numbers: " + sumNaturalNumbers(number));

        scanner.close();
    }
}