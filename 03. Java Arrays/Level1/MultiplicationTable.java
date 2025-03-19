import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int inputNumber = scanner.nextInt();
        int[] multiplicationResults = new int[10];
        
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            multiplicationResults[multiplier - 1] = inputNumber * multiplier;
        }
        
        System.out.println("Multiplication Table of " + inputNumber + ":");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(inputNumber + " * " + multiplier + " = " + multiplicationResults[multiplier - 1]);
        }
        
        scanner.close();
    }
}