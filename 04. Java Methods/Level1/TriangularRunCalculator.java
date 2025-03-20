import java.util.Scanner;

public class TriangularRunCalculator {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = scanner.nextDouble();
        if (side1 <= 0) {
            System.out.println("Invalid side length.");
            System.exit(0);
        }

        System.out.println("Enter side2: ");
        double side2 = scanner.nextDouble();
        if (side2 <= 0) {
            System.out.println("Invalid side length.");
            System.exit(0);
        }

        System.out.println("Enter side3: ");
        double side3 = scanner.nextDouble();
        if (side3 <= 0) {
            System.out.println("Invalid side length.");
            System.exit(0);
        }

        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);

        scanner.close();
    }
}