import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fee: ");
        double fee = scanner.nextDouble();
        System.out.println("Enter discount percent: ");
        double discountPercent = scanner.nextDouble();
        double discountAmount = fee * (discountPercent / 100);
        double discountedFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}