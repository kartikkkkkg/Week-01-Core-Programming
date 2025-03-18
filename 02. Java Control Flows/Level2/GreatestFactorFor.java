import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int greatestFactor = 1;
        
        if (inputNumber > 0) {
            for (int divisor = inputNumber - 1; divisor >= 1; divisor--) {
                if (inputNumber % divisor == 0) {
                    greatestFactor = divisor;
                    break;
                }
            }
        }
        
        System.out.println("Greatest factor: " + greatestFactor);
        scanner.close();
    }
}