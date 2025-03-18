import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int originalNumber = inputNumber;
        int sumOfCubes = 0;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sumOfCubes += digit * digit * digit;
            originalNumber /= 10;
        }
        
        if (sumOfCubes == inputNumber) {
            System.out.println(inputNumber + " is an Armstrong Number");
        } else {
            System.out.println(inputNumber + " is not an Armstrong Number");
        }
        
        scanner.close();
    }
}