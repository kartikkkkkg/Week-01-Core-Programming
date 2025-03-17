import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double conversionFactor = 6.4516;
        double areaIn2 = areaCm2 / conversionFactor;
        System.out.println("Area of Triangle is " + areaCm2 + " square cm and " + areaIn2 + " square inches");
    }
}