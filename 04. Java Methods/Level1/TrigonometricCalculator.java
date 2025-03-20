import java.util.Scanner;

public class TrigonometricCalculator {
    public static double[] calculateTrigonometricFunctions(double degrees) {
        double radians = Math.toRadians(degrees);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Angle in Degrees: ");
        double degrees = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(degrees);
        System.out.printf("Sin(%.2f°) = %.4f\n", degrees, results[0]);
        System.out.printf("Cos(%.2f°) = %.4f\n", degrees, results[1]);
        System.out.printf("Tan(%.2f°) = %.4f\n", degrees, results[2]);

        scanner.close();
    }
}