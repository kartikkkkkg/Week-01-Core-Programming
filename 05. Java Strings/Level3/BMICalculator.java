import java.util.Scanner;

public class BMICalculator {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = Math.round(weight / (heightM * heightM) * 100.0) / 100.0;
        String status = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] computeBMIInfo(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.format("%.2f", data[i][1]);
            result[i][1] = String.format("%.2f", data[i][0]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : data) {
            System.out.printf("%s\t%s\t%s\t%s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                data[i][0] = scanner.nextDouble();
                if (data[i][0] <= 0) throw new IllegalArgumentException("Weight must be positive");
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                data[i][1] = scanner.nextDouble();
                if (data[i][1] <= 0) throw new IllegalArgumentException("Height must be positive");
            }
            String[][] bmiInfo = computeBMIInfo(data);
            displayTable(bmiInfo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}