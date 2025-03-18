import java.util.Scanner;
public class NaturalNumberSumFor {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter num");
      int number = scanner.nextInt();
      int total = 0;
      if (number > 0) {
         int formulaSum = number * (number + 1) / 2;
         System.out.println("Using Formula " + formulaSum);
         for (int i = 1; i <= number; i++) {
            total += i;
         }
         System.out.println("Using For Loop " + total);
         if (formulaSum == total) {
            System.out.println("both are equal");
         }
      }
      scanner.close();
   }
}