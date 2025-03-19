import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int personCount = scanner.nextInt();
        if (personCount <= 0) {
            System.out.println("Invalid number of persons.");
            System.exit(0);
        }

        double[] weights = new double[personCount];
        double[] heights = new double[personCount];
        double[] bmiValues = new double[personCount];
        String[] weightStatuses = new String[personCount];

        System.out.println("Enter Weight ");
        for (int index = 0; index < personCount; index++) {
            double inputWeight = scanner.nextDouble();
            if (inputWeight <= 0) {
                System.out.println("Invalid weight. Enter again: ");
                index--;
                continue;
            }
            weights[index] = inputWeight;
        }

        System.out.println("Enter Height in cm ");
        for (int index = 0; index < personCount; index++) {
            double inputHeight = scanner.nextDouble();
            if (inputHeight <= 0) {
                System.out.println("Invalid height. Enter again: ");
                index--;
                continue;
            }
            heights[index] = inputHeight;
        }

        for (int index = 0; index < personCount; index++) {
            bmiValues[index] = weights[index] / ((heights[index] / 100.0) * (heights[index] / 100.0));
            if (bmiValues[index] <= 18.4) {
                weightStatuses[index] = "Underweight";
            } else if (bmiValues[index] <= 24.9) {
                weightStatuses[index] = "Normal";
            } else if (bmiValues[index] <= 39.9) {
                weightStatuses[index] = "Overweight";
            } else {
                weightStatuses[index] = "Obese";
            }
        }

        for (int index = 0; index < personCount; index++) {
            System.out.println("Weight: " + weights[index] + " Height: " + heights[index] + " BMI: " + bmiValues[index] + " Status: " + weightStatuses[index]);
        }

        scanner.close();
    }
}