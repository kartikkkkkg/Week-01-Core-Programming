import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter Salaries: ");
        for (int index = 0; index < salaries.length; index++) {
            double inputSalary = scanner.nextDouble();
            if (inputSalary <= 0) {
                System.out.println("Invalid salary. Enter again: ");
                index--;
                continue;
            }
            salaries[index] = inputSalary;
        }

        System.out.println("Enter Years of Service: ");
        for (int index = 0; index < yearsOfService.length; index++) {
            double inputYears = scanner.nextDouble();
            if (inputYears < 0) {
                System.out.println("Invalid years of service. Enter again: ");
                index--;
                continue;
            }
            yearsOfService[index] = inputYears;
        }

        for (int index = 0; index < salaries.length; index++) {
            double bonusRate = yearsOfService[index] >= 5 ? 0.05 : 0.02;
            bonuses[index] = salaries[index] * bonusRate;
            newSalaries[index] = salaries[index] + bonuses[index];
            totalBonus += bonuses[index];
            totalOldSalary += salaries[index];
            totalNewSalary += newSalaries[index];
        }

        for (int index = 0; index < salaries.length; index++) {
            System.out.println("Old Salary: " + salaries[index] + " New Salary: " + newSalaries[index] + " Bonus: " + bonuses[index]);
        }
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}