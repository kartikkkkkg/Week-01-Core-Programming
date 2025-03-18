import java.util.Scanner;

public class PowerCalculatorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseNumber = scanner.nextInt();
        int powerValue = scanner.nextInt();
        long result = 1;
        
        if (baseNumber > 0 && powerValue >= 0) {
            for (int count = 1; count <= powerValue; count++) {
                result *= baseNumber;
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}