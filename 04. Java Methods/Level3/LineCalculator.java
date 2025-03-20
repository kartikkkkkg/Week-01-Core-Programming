import java.util.Scanner;

public class LineCalculator {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] points = new int[2][2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter x" + (i + 1) + ": ");
            points[i][0] = scanner.nextInt();
            System.out.println("Enter y" + (i + 1) + ": ");
            points[i][1] = scanner.nextInt();
        }
        double distance = calculateDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        double[] equation = findLineEquation(points[0][0], points[0][1], points[1][0], points[1][1]);
        System.out.printf("Euclidean Distance: %.2f\n", distance);
        System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        scanner.close();
    }
}