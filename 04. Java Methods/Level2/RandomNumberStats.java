import java.util.Scanner;

public class RandomNumberStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 9000) + 1000;
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new double[]{sum / (double) numbers.length, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of random numbers: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size.");
            System.exit(0);
        }
        int[] numbers = generate4DigitRandomArray(size);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        double[] stats = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", stats[0], stats[1], stats[2]);
        scanner.close();
    }
}