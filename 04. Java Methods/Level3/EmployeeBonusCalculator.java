import java.util.Random;

public class EmployeeBonusCalculator {
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] employees = new int[10][2];
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = 10000 + random.nextInt(90000);
            employees[i][1] = random.nextInt(11);
        }
        return employees;
    }

    public static double[][] calculateBonuses(int[][] employees) {
        double[][] results = new double[10][2];
        for (int i = 0; i < employees.length; i++) {
            double bonusRate = employees[i][1] > 5 ? 0.05 : 0.02;
            double bonus = employees[i][0] * bonusRate;
            results[i][0] = employees[i][0] + bonus;
            results[i][1] = bonus;
        }
        return results;
    }

    public static void displayResults(int[][] employees, double[][] bonuses) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-15s %-12s %-12s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-5d %-12d %-15d %-12.2f %-12.2f\n",
                    (i + 1), employees[i][0], employees[i][1], bonuses[i][1], bonuses[i][0]);
            totalOldSalary += employees[i][0];
            totalNewSalary += bonuses[i][0];
            totalBonus += bonuses[i][1];
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-15s %-12.2f %-12.2f\n",
                "Total", totalOldSalary, "", totalBonus, totalNewSalary);
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();
        double[][] bonuses = calculateBonuses(employees);
        displayResults(employees, bonuses);
    }
}