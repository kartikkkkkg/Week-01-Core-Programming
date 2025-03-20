import java.util.Scanner;

public class NaturalNumberSumRecursive {
    public static int sumRecursive(int number) {
        if (number <= 0) return 0;
        return number + sumRecursive(number - 1);
    }

    public static int sumFormula(int number) {
        return (number * (number + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        int recursiveSum = sumRecursive(number);
        int formulaSum = sumFormula(number);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Result is " + (recursiveSum == formulaSum ? "correct" : "incorrect"));

        scanner.close();
    }
}