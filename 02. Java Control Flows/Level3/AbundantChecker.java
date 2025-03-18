import java.util.Scanner;

public class AbundantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int divisorSum = 0;
        
        for (int divisor = 1; divisor < inputNumber; divisor++) {
            if (inputNumber % divisor == 0) {
                divisorSum += divisor;
            }
        }
        
        if (divisorSum > inputNumber) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        
        scanner.close();
    }
}