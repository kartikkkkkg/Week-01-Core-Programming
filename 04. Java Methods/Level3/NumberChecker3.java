import java.util.Scanner;

public class NumberChecker3 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return java.util.Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        return areArraysEqual(getDigits(number), reverseDigits(getDigits(number)));
    }

    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + java.util.Arrays.toString(digits));
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversed));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        scanner.close();
    }
}