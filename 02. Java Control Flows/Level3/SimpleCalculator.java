import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        String operator = scanner.next();
        double result;
        
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        
        scanner.close();
    }
}