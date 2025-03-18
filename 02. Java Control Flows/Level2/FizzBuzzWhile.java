import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int currentNumber = 1;
        
        if (inputNumber > 0) {
            while (currentNumber <= inputNumber) {
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (currentNumber % 3 == 0) {
                    System.out.println("Fizz");
                } else if (currentNumber % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(currentNumber);
                }
                currentNumber++;
            }
        }
        
        scanner.close();
    }
}