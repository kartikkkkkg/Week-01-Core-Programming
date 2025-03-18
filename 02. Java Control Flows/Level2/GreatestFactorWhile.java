import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int greatestFactor = 1;
        int divisor = inputNumber - 1;
        
        if (inputNumber > 0) {
            while (divisor >= 1) {
                if (inputNumber % divisor == 0) {
                    greatestFactor = divisor;
                    break;
                }
                divisor--;
            }
        }
        
        System.out.println("Greatest factor: " + greatestFactor);
        scanner.close();
    }
}