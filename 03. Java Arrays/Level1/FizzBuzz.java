import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = scanner.nextInt();
        
        if (inputNumber <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }
        
        String[] resultsArray = new String[inputNumber + 1];
        resultsArray[0] = "0";
        
        for (int number = 1; number <= inputNumber; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                resultsArray[number] = "FizzBuzz";
            } else if (number % 5 == 0) {
                resultsArray[number] = "Buzz";
            } else if (number % 3 == 0) {
                resultsArray[number] = "Fizz";
            } else {
                resultsArray[number] = String.valueOf(number);
            }
        }
        
        for (int index = 0; index <= inputNumber; index++) {
            System.out.println("Position " + index + " = " + resultsArray[index]);
        }
        
        scanner.close();
    }
}