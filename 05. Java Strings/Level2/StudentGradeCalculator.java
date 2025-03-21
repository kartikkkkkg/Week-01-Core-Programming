import java.util.Scanner;
import java.util.Random;

public class StudentGradeCalculator {
    public static int[][] generateScores(int count) {
        Random rand = new Random();
        int[][] scores = new int[count][3];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60;
            }
        }
        return scores;
    }

    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            metrics[i][0] = total;
            metrics[i][1] = Math.round(total / 3.0 * 100.0) / 100.0;
            metrics[i][2] = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
        }
        return metrics;
    }

    public static String[] assignGrades(double[][] metrics) {
        String[] grades = new String[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            double percent = metrics[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else grades[i] = "D";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] metrics, String[] grades) {
        System.out.println("ID\tPhysics\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%%\t%s%n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                metrics[i][0], metrics[i][1], metrics[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        try {
            if (count <= 0) throw new IllegalArgumentException("Number of students must be positive");
            int[][] scores = generateScores(count);
            double[][] metrics = calculateMetrics(scores);
            String[] grades = assignGrades(metrics);
            displayScorecard(scores, metrics, grades);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}