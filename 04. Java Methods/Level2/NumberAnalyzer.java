import java.util.Scanner;

public class NumberAnalyzer {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        int comparison = compareNumbers(numbers[0], numbers[numbers.length - 1]);
        System.out.println("First and last elements are " +
                (comparison == 0 ? "equal" : comparison > 0 ? "first > last" : "first < last"));
        scanner.close();
    }
}