import java.util.Scanner;

public class TriangularParkRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3 (in meters): ");
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistanceInMeters = 5000;
        double rounds = totalDistanceInMeters / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}