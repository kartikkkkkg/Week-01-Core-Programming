import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightKg = scanner.nextDouble();
        double heightCm = scanner.nextDouble();
        double heightM = heightCm / 100;
        double bmiValue = weightKg / (heightM * heightM);
        
        if (bmiValue <= 18.4) {
            System.out.println("Underweight");
        } else if (bmiValue <= 24.9) {
            System.out.println("Normal");
        } else if (bmiValue <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        scanner.close();
    }
}