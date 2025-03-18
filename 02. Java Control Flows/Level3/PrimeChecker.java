import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        boolean isPrime = true;
        
        if (inputNumber > 1) {
            for (int divisor = 2; divisor < inputNumber; divisor++) {
                if (inputNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        
        System.out.println("It is a prime number: " + isPrime);
        scanner.close();
    }
}