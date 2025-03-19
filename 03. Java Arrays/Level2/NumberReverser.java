import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        int tempNumber = inputNumber;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        tempNumber = inputNumber;
        for (int index = 0; index < digitCount; index++) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println("Reversed Number: ");
        for (int index = 0; index < digits.length; index++) {
            System.out.print(digits[index]);
        }

        scanner.close();
    }
}