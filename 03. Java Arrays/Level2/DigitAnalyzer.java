import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int digitIndex = 0;
        int tempNumber = inputNumber;

        while (tempNumber != 0) {
            if (digitIndex == maxDigits) {
                maxDigits += 10;
                int[] tempArray = new int[maxDigits];
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                digits = tempArray;
            }
            digits[digitIndex++] = tempNumber % 10;
            tempNumber /= 10;
        }

        int largestDigit = -1;
        int secondLargestDigit = -1;
        for (int index = 0; index < digitIndex; index++) {
            if (digits[index] > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digits[index];
            } else if (digits[index] > secondLargestDigit && digits[index] != largestDigit) {
                secondLargestDigit = digits[index];
            }
        }

        System.out.println("Largest Digit: " + largestDigit);
        if (secondLargestDigit != -1) {
            System.out.println("Second Largest Digit: " + secondLargestDigit);
        } else {
            System.out.println("No Second Largest Digit (All digits are the same)");
        }

        scanner.close();
    }
}