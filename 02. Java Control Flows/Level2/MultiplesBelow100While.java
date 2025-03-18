import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int currentNumber = 100;
        
        if (inputNumber > 0 && inputNumber <= 100) {
            while (currentNumber >= 1) {
                if (currentNumber % inputNumber == 0) {
                    System.out.println(currentNumber);
                }
                currentNumber--;
            }
        }
        
        scanner.close();
    }
}