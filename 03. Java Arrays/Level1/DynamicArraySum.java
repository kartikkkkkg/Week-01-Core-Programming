import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double totalSum = 0.0;
        int currentIndex = 0;
        
        System.out.println("Enter Values up to 10: ");
        while (true) {
            if (currentIndex >= 10) {
                break;
            }
            double inputNumber = scanner.nextDouble();
            if (inputNumber <= 0) {
                break;
            }
            numbers[currentIndex] = inputNumber;
            totalSum += inputNumber;
            currentIndex++;
        }
        
        System.out.println("Stored Values: ");
        for (int index = 0; index < currentIndex; index++) {
            System.out.println("Position " + (index + 1) + " = " + numbers[index]);
        }
        System.out.println("Sum of all numbers: " + totalSum);
        
        scanner.close();
    }
}