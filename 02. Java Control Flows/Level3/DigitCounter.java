import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int digitCount = 0;
        int tempNumber = Math.abs(inputNumber);
        
        do {
            digitCount++;
            tempNumber /= 10;
        } while (tempNumber != 0);
        
        System.out.println("Total Digits: " + digitCount);
        scanner.close();
    }
}