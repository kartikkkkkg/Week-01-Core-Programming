import java.util.Scanner;
public class EmployeeBonusCalculator {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter years of service");
      int yearsOfService = scanner.nextInt();
      System.out.println("Enter salary");
      double salary = scanner.nextDouble();
      if (yearsOfService > 5) {
         double bonus = 0.05 * salary;
         System.out.println("Bonus is " + bonus);
      }
      scanner.close();
   }
}