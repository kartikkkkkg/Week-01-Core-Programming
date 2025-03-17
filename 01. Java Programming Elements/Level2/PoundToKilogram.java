import java.util.Scanner;

public class PoundToKilogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.453592;
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
    }
}