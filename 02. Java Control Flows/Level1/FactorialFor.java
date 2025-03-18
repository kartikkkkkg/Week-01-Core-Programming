import java.util.Scanner;
public class FactorialFor {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter num");
      int number = scanner.nextInt();
      long factorial = 1;
      if (number >= 0) {
         for (int i = 1; i <= number; i++) {
            factorial *= i;
         }
         System.out.println(factorial);
      }
      scanner.close();
   }
}