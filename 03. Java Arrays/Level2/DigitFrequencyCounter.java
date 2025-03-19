import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        int tempNumber = inputNumber;
        int digitCount = 0;
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        tempNumber = inputNumber;
        for (int index = digitCount - 1; index >= 0; index--) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
        }

        int[] frequency = new int[10];
        for (int index = 0; index < digits.length; index++) {
            frequency[digits[index]]++;
        }

        System.out.println("Total Digits: " + digitCount);
        System.out.println("\nDigit Frequency:");
        for (int digit = 0; digit < frequency.length; digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + " -> " + frequency[digit] + " times");
            }
        }

        scanner.close();
    }
}