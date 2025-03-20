import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        double principal = scanner.nextDouble();
        if (principal <= 0) {
            System.out.println("Invalid principal.");
            System.exit(0);
        }

        System.out.println("Enter Rate: ");
        double rate = scanner.nextDouble();
        if (rate < 0) {
            System.out.println("Invalid rate.");
            System.exit(0);
        }

        System.out.println("Enter Time: ");
        double time = scanner.nextDouble();
        if (time <= 0) {
            System.out.println("Invalid time.");
            System.exit(0);
        }

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n",
                simpleInterest, principal, rate, time);

        scanner.close();
    }
}