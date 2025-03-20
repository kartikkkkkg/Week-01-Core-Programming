import java.util.Scanner;

public class NumberChecker2 {
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        for (int digit : getDigits(number)) sum += digit;
        return sum;
    }

    public static int sumOfSquares(int number) {
        int sum = 0;
        for (int digit : getDigits(number)) sum += (int) Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        return number % sumDigits(number) == 0;
    }

    public static int[][] getDigitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) frequency[i][0] = i;
        for (int digit : digits) frequency[digit][1]++;
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }
        System.out.println("Digits Array: " + java.util.Arrays.toString(getDigits(number)));
        System.out.println("Total Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumDigits(number));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(number));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));
        System.out.println("Digit Frequency:");
        int[][] frequency = getDigitFrequency(number);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " times.");
            }
        }
        scanner.close();
    }
}