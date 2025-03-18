import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        if (inputNumber > 0) {
            for (int currentNumber = 1; currentNumber <= inputNumber; currentNumber++) {
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (currentNumber % 3 == 0) {
                    System.out.println("Fizz");
                } else if (currentNumber % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(currentNumber);
                }
            }
        }
        
        scanner.close();
    }
}