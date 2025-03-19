import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int personCount = scanner.nextInt();
        if (personCount <= 0) {
            System.out.println("Invalid number of persons.");
            System.exit(0);
        }

        double[][] personData = new double[personCount][3];
        String[] weightStatuses = new String[personCount];

        for (int index = 0; index < personCount; index++) {
            System.out.println("Enter Height " + (index + 1) + ": ");
            double inputHeight = scanner.nextDouble();
            if (inputHeight <= 0) {
                System.out.println("Invalid height. Enter again: ");
                index--;
                continue;
            }
            personData[index][0] = inputHeight;

            System.out.println("Enter Weight " + (index + 1) + ": ");
            double inputWeight = scanner.nextDouble();
            if (inputWeight <= 0) {
                System.out.println("Invalid weight. Enter again: ");
                index--;
                continue;
            }
            personData[index][1] = inputWeight;

            personData[index][2] = personData[index][1] / ((personData[index][0] / 100.0) * (personData[index][0] / 100.0));
        }

        for (int index = 0; index < personCount; index++) {
            if (personData[index][2] <= 18.4) {
                weightStatuses[index] = "Underweight";
            } else if (personData[index][2] <= 24.9) {
                weightStatuses[index] = "Normal";
            } else if (personData[index][2] <= 39.9) {
                weightStatuses[index] = "Overweight";
            } else {
                weightStatuses[index] = "Obese";
            }
        }

        for (int index = 0; index < personCount; index++) {
            System.out.println("Weight: " + personData[index][1] + " Height: " + personData[index][0] + " BMI: " + personData[index][2] + " Status: " + weightStatuses[index]);
        }

        scanner.close();
    }
}