import java.util.Scanner;

public class MinMaxFinder {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int largest = Math.max(number1, Math.max(number2, number3));
        int smallest = Math.min(number1, Math.min(number2, number3));
        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter 3rd Number: ");
        int number3 = scanner.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Largest Number: " + result[0]);
        System.out.println("Smallest Number: " + result[1]);

        scanner.close();
    }
}