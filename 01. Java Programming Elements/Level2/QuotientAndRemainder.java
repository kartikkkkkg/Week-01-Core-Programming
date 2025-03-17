import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + firstNumber + " and " + secondNumber);
    }
}