import java.util.Scanner;

public class PartialMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = scanner.nextInt();
        int[] multiplicationResults = new int[4];
        
        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            multiplicationResults[multiplier - 6] = inputNumber * multiplier;
        }
        
        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            System.out.println(inputNumber + " * " + multiplier + " = " + multiplicationResults[multiplier - 6]);
        }
        
        scanner.close();
    }
}