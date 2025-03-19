import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 Numbers");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }
        
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > 0) {
                if (numbers[index] % 2 == 0) {
                    System.out.println("Even Positive Number: " + numbers[index]);
                } else {
                    System.out.println("Odd Positive Number: " + numbers[index]);
                }
            } else if (numbers[index] == 0) {
                System.out.println("Zeroooo");
            } else {
                System.out.println("Negative Number: " + numbers[index]);
            }
        }
        
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];
        
        if (firstNumber == lastNumber) {
            System.out.println("first and last are equal");
        } else if (firstNumber > lastNumber) {
            System.out.println("First is larger");
        } else {
            System.out.println("Last is greater");
        }
        
        scanner.close();
    }
}