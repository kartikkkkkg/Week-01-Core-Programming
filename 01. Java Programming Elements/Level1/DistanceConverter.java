import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double conversionFactor = 1.6;
        double miles = kilometers * conversionFactor;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}