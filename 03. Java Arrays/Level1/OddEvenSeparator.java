import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = scanner.nextInt();
        
        if (inputNumber <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            System.exit(0);
        }
        
        int arraySize = inputNumber / 2 + 1;
        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];
        int oddIndex = 0;
        int evenIndex = 0;
        
        for (int number = 1; number <= inputNumber; number++) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex++] = number;
            } else {
                oddNumbers[oddIndex++] = number;
            }
        }
        
        System.out.println("Even Numbers: ");
        for (int index = 0; index < evenIndex; index++) {
            System.out.print(evenNumbers[index] + " ");
        }
        System.out.println("\nOdd Numbers: ");
        for (int index = 0; index < oddIndex; index++) {
            System.out.print(oddNumbers[index] + " ");
        }
        
        scanner.close();
    }
}