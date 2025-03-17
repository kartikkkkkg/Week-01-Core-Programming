import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();
        double inches = heightCm / 2.54;
        double feet = inches / 12;
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}