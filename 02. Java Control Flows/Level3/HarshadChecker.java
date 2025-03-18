import java.util.Scanner;

public class HarshadChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int tempNumber = inputNumber;
        int digitSum = 0;
        
        while (tempNumber > 0) {
            digitSum += tempNumber % 10;
            tempNumber /= 10;
        }
        
        if (inputNumber % digitSum == 0) {
            System.out.println(inputNumber + " is a Harshad Number");
        } else {
            System.out.println(inputNumber + " is not a Harshad Number");
        }
        
        scanner.close();
    }
}