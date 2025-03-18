import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseNumber = scanner.nextInt();
        int powerValue = scanner.nextInt();
        long result = 1;
        int counter = 0;
        
        if (baseNumber > 0 && powerValue >= 0) {
            while (counter < powerValue) {
                result *= baseNumber;
                counter++;
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}