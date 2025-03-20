import java.util.Scanner;

public class NumberChecker5 {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getGreatestFactor(int number) {
        int[] factors = getFactors(number);
        return factors[factors.length - 2];
    }

    public static int getSumOfFactors(int number) {
        int sum = 0;
        for (int factor : getFactors(number)) sum += factor;
        return sum;
    }

    public static long getProductOfFactors(int number) {
        long product = 1;
        for (int factor : getFactors(number)) product *= factor;
        return product;
    }

    public static double getProductOfCubeOfFactors(int number) {
        double product = 1;
        for (int factor : getFactors(number)) product *= Math.pow(factor, 3);
        return product;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        int[] factors = getFactors(number);
        for (int i = 0; i < factors.length - 1; i++) sum += factors[i];
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        int[] factors = getFactors(number);
        for (int i = 0; i < factors.length - 1; i++) sum += factors[i];
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        int[] factors = getFactors(number);
        for (int i = 0; i < factors.length - 1; i++) sum += factors[i];
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 2; i <= digit; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }
        System.out.println("Factors: " + java.util.Arrays.toString(getFactors(number)));
        System.out.println("Greatest Factor: " + getGreatestFactor(number));
        System.out.println("Sum of Factors: " + getSumOfFactors(number));
        System.out.println("Product of Factors: " + getProductOfFactors(number));
        System.out.println("Product of Cube of Factors: " + getProductOfCubeOfFactors(number));
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
        scanner.close();
    }
}