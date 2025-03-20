import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][3];
        String[] bmiStatuses = new String[10];
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter weight of person " + (i + 1) + " (kg): ");
            double weight = scanner.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid weight. Enter again: ");
                i--;
                continue;
            }
            persons[i][0] = weight;
            System.out.println("Enter height of person " + (i + 1) + " (cm): ");
            double height = scanner.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid height. Enter again: ");
                i--;
                continue;
            }
            persons[i][1] = height;
            persons[i][2] = calculateBMI(weight, height);
            bmiStatuses[i] = getBMIStatus(persons[i][2]);
        }
        System.out.println("\nWeight, Height, BMI & Status:");
        System.out.printf("%-12s %-12s %-12s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%-12.2f %-12.2f %-12.2f %-15s\n",
                    persons[i][0], persons[i][1], persons[i][2], bmiStatuses[i]);
        }
        scanner.close();
    }
}