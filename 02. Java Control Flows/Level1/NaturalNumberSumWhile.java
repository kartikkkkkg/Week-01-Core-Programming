import java.util.Scanner;
public class NaturalNumberSumWhile {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter num");
      int number = scanner.nextInt();
      int total = 0;
      if (number > 0) {
         int formulaSum = number * (number + 1) / 2;
         System.out.println("Using Formula " + formulaSum);
         int tempNumber = number;
         while (tempNumber > 0) {
            total += tempNumber;
            tempNumber--;
         }
         System.out.println("Using While Loop " + total);
         if (formulaSum == total) {
            System.out.println("both are equal");
         }
      }
      scanner.close();
   }
}