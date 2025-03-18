import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        if (inputNumber > 0 && inputNumber <= 100) {
            for (int currentNumber = 100; currentNumber >= 1; currentNumber--) {
                if (currentNumber % inputNumber == 0) {
                    System.out.println(currentNumber);
                }
            }
        }
        
        scanner.close();
    }
}