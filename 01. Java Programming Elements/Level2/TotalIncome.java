import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter bonus: ");
        double bonus = scanner.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}