import java.util.Scanner;

public class CollinearityChecker {
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x2 - x1 == 0 || x3 - x2 == 0 || x3 - x1 == 0) {
            return (x1 == x2 && x2 == x3);
        }
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        return Math.abs(slopeAB - slopeBC) < 1e-10 && Math.abs(slopeBC - slopeAC) < 1e-10;
    }

    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area < 1e-10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] points = new int[3][2];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter x" + (i + 1) + ", y" + (i + 1) + ": ");
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }
        boolean bySlope = isCollinearBySlope(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1]);
        boolean byArea = isCollinearByArea(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1]);
        System.out.println("Collinear by Slope Method: " + bySlope);
        System.out.println("Collinear by Area Method: " + byArea);
        scanner.close();
    }
}