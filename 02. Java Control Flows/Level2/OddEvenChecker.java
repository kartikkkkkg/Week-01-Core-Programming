import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        if (inputNumber > 0) {
            for (int currentNumber = 1; currentNumber <= inputNumber; currentNumber++) {
                String result = (currentNumber % 2 == 0) ? "even" : "odd";
                System.out.println(currentNumber + " is " + result);
            }
        }
        
        scanner.close();
    }
}