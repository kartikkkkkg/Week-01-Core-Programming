import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearsOfService = scanner.nextInt();
        double salary = scanner.nextDouble();
        double bonusAmount = 0;
        
        if (yearsOfService > 5) {
            bonusAmount = 0.05 * salary;
        }
        
        System.out.println("Bonus is " + bonusAmount);
        scanner.close();
    }
}