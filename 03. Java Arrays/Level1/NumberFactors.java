import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = scanner.nextInt();
        
        if (inputNumber <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }
        
        int maxFactors = 10;
        int[] factorsArray = new int[maxFactors];
        int factorIndex = 0;
        
        for (int divisor = 1; divisor <= inputNumber; divisor++) {
            if (inputNumber % divisor == 0) {
                if (factorIndex == maxFactors) {
                    maxFactors *= 2;
                    int[] tempArray = new int[maxFactors];
                    for (int index = 0; index < factorsArray.length; index++) {
                        tempArray[index] = factorsArray[index];
                    }
                    factorsArray = tempArray;
                }
                factorsArray[factorIndex++] = divisor;
            }
        }
        
        System.out.print("Factor Array: ");
        for (int index = 0; index < factorIndex; index++) {
            System.out.print(factorsArray[index] + " ");
        }
        
        scanner.close();
    }
}