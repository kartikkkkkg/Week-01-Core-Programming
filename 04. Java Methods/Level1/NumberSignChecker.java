import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        int result = checkNumberSign(number);
        System.out.println("Result: " + (result == 1 ? "Positive" : result == -1 ? "Negative" : "Zero"));

        scanner.close();
    }
}